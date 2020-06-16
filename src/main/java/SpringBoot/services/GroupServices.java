package SpringBoot.services;

import SpringBoot.dto.Group;
import SpringBoot.dto.MyServiceGrpc;
import SpringBoot.dto.Request;
import io.grpc.stub.StreamObserver;

/**
 * @author ntt
 */
public class GroupServices extends MyServiceGrpc.MyServiceImplBase {
    @Override
    public void getGroups(Request request, StreamObserver<Group> responseObserver) {
    }
}
