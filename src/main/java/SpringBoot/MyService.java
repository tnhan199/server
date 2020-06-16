package SpringBoot;

import SpringBoot.dto.MyServiceGrpc;
import SpringBoot.dto.Project;
import SpringBoot.dto.Response;
import io.grpc.stub.StreamObserver;
import net.devh.boot.grpc.server.service.GrpcService;

/**
 * @author ntt
 */
@GrpcService
public class MyService extends MyServiceGrpc.MyServiceImplBase {
    @Override
    public void addProject(Project request, StreamObserver<Response> responseObserver) {
        responseObserver.onNext(Response.newBuilder().setMessage("cnn").build());
        responseObserver.onCompleted();
    }
}
