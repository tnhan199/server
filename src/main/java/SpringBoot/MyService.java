package SpringBoot;

import java.util.Iterator;

import org.springframework.beans.factory.annotation.Autowired;

import SpringBoot.Converter.GroupConverter;
import SpringBoot.Converter.ProjectConverter;
import SpringBoot.dto.Group;
import SpringBoot.dto.MyServiceGrpc;
import SpringBoot.dto.Project;
import SpringBoot.dto.Request;
import SpringBoot.dto.Response;
import SpringBoot.reponsitory1.EmployeeReponsitory;
import SpringBoot.reponsitory1.GroupReponsitory;
import SpringBoot.reponsitory1.ProjectRepository;
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
            for (String i : request.getMember().split(",")) {
                if (employeeReponsitory.countByVisa(i) == 0)
                    check = 1;
            }
            if (check == 1)
                responeBuilder.setIsSuccess(3);
            else {
                projectRepository.save(projectConverter.toEntity(request));
                responeBuilder.setIsSuccess(1);
            }
        }
        responseObserver.onNext(responeBuilder.build());
        responseObserver.onCompleted();
    }
}
