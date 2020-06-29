package SpringBoot;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import SpringBoot.Converter.GroupConverter;
import SpringBoot.Converter.ProjectConverter;
import SpringBoot.dto.Group;
import SpringBoot.dto.MyServiceGrpc;
import SpringBoot.dto.Project;
import SpringBoot.dto.Request;
import SpringBoot.dto.Response;
import SpringBoot.reponsitory.EmployeeReponsitory;
import SpringBoot.reponsitory.GroupReponsitory;
import SpringBoot.reponsitory.Project.ProjectRepository;
import io.grpc.stub.StreamObserver;
import net.devh.boot.grpc.server.service.GrpcService;

/**
 * @author ntt
 */
@GrpcService
public class MyService extends MyServiceGrpc.MyServiceImplBase {
    @Autowired
    private GroupReponsitory groupReponsitory;
    @Autowired
    private GroupConverter groupConverter;
    @Autowired
    private ProjectRepository projectRepository;
    @Autowired
    private EmployeeReponsitory employeeReponsitory;
    @Autowired
    private ProjectConverter projectConverter;

    @Override
    public void getGroups(Request request, StreamObserver<Group> responseObserver) {
        if (request.getTypeRequest() == 0) {
            Iterator<SpringBoot.entity.Group> iterator = groupReponsitory.findAll().iterator();
            while (iterator.hasNext()) {
                responseObserver.onNext(groupConverter.toDTO(iterator.next()));
            }
        }
        responseObserver.onCompleted();
    }

    @Override
    public void addProject(Project request, StreamObserver<Response> responseObserver) {
        Response.Builder responeBuilder = Response.newBuilder();

        if (projectRepository.countByProjectNumber(request.getProjectNumber()) > 0) {
            responeBuilder.setIsSuccess(2);
        } else {
            int check = 0;
            //String message = "The following visas do not exist: ";
            List<String> visas = new ArrayList<>();
            for (String i : request.getMember().split(",")) {
                if (employeeReponsitory.countByVisa(i) == 0) {
                    check = 1;
                    visas.add(i);
                }
            }
            if (check == 1) {
                responeBuilder.setIsSuccess(3);
                responeBuilder.setMessage("The following visas do not exist: " + String.join(",", visas));
            } else {
                projectRepository.save(projectConverter.toEntity(request));
                responeBuilder.setIsSuccess(1);
            }
        }
        responseObserver.onNext(responeBuilder.build());
        responseObserver.onCompleted();
    }

    @Override
    public void getProjects(Request request, StreamObserver<Project> responseObserver) {
        SpringBoot.entity.Project project = projectConverter.toEntity(request.getProject());
        projectRepository.searchBy(project, request.getPage(), request.getMaxItemInPage()).forEach(project1 -> {
            responseObserver.onNext(projectConverter.toDTO(project1));
        });
        responseObserver.onCompleted();
    }

    @Override
    public void deleteProject(Project request, StreamObserver<Response> responseObserver) {
        Response.Builder builder = Response.newBuilder();
        try {
            projectRepository.deleteById(request.getId());
            builder.setIsSuccess(1);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            builder.setIsSuccess(0);
        }
        responseObserver.onNext(builder.build());
        responseObserver.onCompleted();

    }

    @Override
    public void updateProject(Project request, StreamObserver<Response> responseObserver) {
        Response.Builder builder = Response.newBuilder();
        try {
            projectRepository.save(projectConverter.toEntity(request));
            builder.setIsSuccess(1);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            builder.setIsSuccess(0);
        }
        responseObserver.onNext(builder.build());
        responseObserver.onCompleted();
    }
}
