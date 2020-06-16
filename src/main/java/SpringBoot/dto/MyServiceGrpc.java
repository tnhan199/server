package SpringBoot.dto;

import io.grpc.stub.ServerCalls;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.*;
import static io.grpc.stub.ServerCalls.*;

/**
 * <pre>
 * Interface exported by the server.
 * </pre>
 */
@javax.annotation.Generated(
        value = "by gRPC proto compiler (version 1.29.0)",
        comments = "Source: Project.proto")
public final class MyServiceGrpc {

    private MyServiceGrpc() {
    }

    public static final String SERVICE_NAME = "routeguide.MyService";

    // Static method descriptors that strictly reflect the proto.
    private static volatile io.grpc.MethodDescriptor<Project,
            Response> getAddProjectMethod;

    @io.grpc.stub.annotations.RpcMethod(
            fullMethodName = SERVICE_NAME + '/' + "addProject",
            requestType = Project.class,
            responseType = Response.class,
            methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
    public static io.grpc.MethodDescriptor<Project,
            Response> getAddProjectMethod() {
        io.grpc.MethodDescriptor<Project, Response> getAddProjectMethod;
        if ((getAddProjectMethod = MyServiceGrpc.getAddProjectMethod) == null) {
            synchronized (MyServiceGrpc.class) {
                if ((getAddProjectMethod = MyServiceGrpc.getAddProjectMethod) == null) {
                    MyServiceGrpc.getAddProjectMethod = getAddProjectMethod =
                            io.grpc.MethodDescriptor.<Project, Response>newBuilder()
                                    .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                                    .setFullMethodName(generateFullMethodName(SERVICE_NAME, "addProject"))
                                    .setSampledToLocalTracing(true)
                                    .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                                            Project.getDefaultInstance()))
                                    .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                                            Response.getDefaultInstance()))
                                    .setSchemaDescriptor(new MyServiceMethodDescriptorSupplier("addProject"))
                                    .build();
                }
            }
        }
        return getAddProjectMethod;
    }

    private static volatile io.grpc.MethodDescriptor<Request,
            Project> getGetProjectsMethod;

    @io.grpc.stub.annotations.RpcMethod(
            fullMethodName = SERVICE_NAME + '/' + "getProjects",
            requestType = Request.class,
            responseType = Project.class,
            methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
    public static io.grpc.MethodDescriptor<Request,
            Project> getGetProjectsMethod() {
        io.grpc.MethodDescriptor<Request, Project> getGetProjectsMethod;
        if ((getGetProjectsMethod = MyServiceGrpc.getGetProjectsMethod) == null) {
            synchronized (MyServiceGrpc.class) {
                if ((getGetProjectsMethod = MyServiceGrpc.getGetProjectsMethod) == null) {
                    MyServiceGrpc.getGetProjectsMethod = getGetProjectsMethod =
                            io.grpc.MethodDescriptor.<Request, Project>newBuilder()
                                    .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
                                    .setFullMethodName(generateFullMethodName(SERVICE_NAME, "getProjects"))
                                    .setSampledToLocalTracing(true)
                                    .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                                            Request.getDefaultInstance()))
                                    .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                                            Project.getDefaultInstance()))
                                    .setSchemaDescriptor(new MyServiceMethodDescriptorSupplier("getProjects"))
                                    .build();
                }
            }
        }
        return getGetProjectsMethod;
    }

    private static volatile io.grpc.MethodDescriptor<Request,
            Group> getGetGroupsMethod;

    @io.grpc.stub.annotations.RpcMethod(
            fullMethodName = SERVICE_NAME + '/' + "getGroups",
            requestType = Request.class,
            responseType = Group.class,
            methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
    public static io.grpc.MethodDescriptor<Request,
            Group> getGetGroupsMethod() {
        io.grpc.MethodDescriptor<Request, Group> getGetGroupsMethod;
        if ((getGetGroupsMethod = MyServiceGrpc.getGetGroupsMethod) == null) {
            synchronized (MyServiceGrpc.class) {
                if ((getGetGroupsMethod = MyServiceGrpc.getGetGroupsMethod) == null) {
                    MyServiceGrpc.getGetGroupsMethod = getGetGroupsMethod =
                            io.grpc.MethodDescriptor.<Request, Group>newBuilder()
                                    .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
                                    .setFullMethodName(generateFullMethodName(SERVICE_NAME, "getGroups"))
                                    .setSampledToLocalTracing(true)
                                    .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                                            Request.getDefaultInstance()))
                                    .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                                            Group.getDefaultInstance()))
                                    .setSchemaDescriptor(new MyServiceMethodDescriptorSupplier("getGroups"))
                                    .build();
                }
            }
        }
        return getGetGroupsMethod;
    }

    private static volatile io.grpc.MethodDescriptor<Project,
            Response> getUpdateProjectMethod;

    @io.grpc.stub.annotations.RpcMethod(
            fullMethodName = SERVICE_NAME + '/' + "updateProject",
            requestType = Project.class,
            responseType = Response.class,
            methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
    public static io.grpc.MethodDescriptor<Project,
            Response> getUpdateProjectMethod() {
        io.grpc.MethodDescriptor<Project, Response> getUpdateProjectMethod;
        if ((getUpdateProjectMethod = MyServiceGrpc.getUpdateProjectMethod) == null) {
            synchronized (MyServiceGrpc.class) {
                if ((getUpdateProjectMethod = MyServiceGrpc.getUpdateProjectMethod) == null) {
                    MyServiceGrpc.getUpdateProjectMethod = getUpdateProjectMethod =
                            io.grpc.MethodDescriptor.<Project, Response>newBuilder()
                                    .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                                    .setFullMethodName(generateFullMethodName(SERVICE_NAME, "updateProject"))
                                    .setSampledToLocalTracing(true)
                                    .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                                            Project.getDefaultInstance()))
                                    .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                                            Response.getDefaultInstance()))
                                    .setSchemaDescriptor(new MyServiceMethodDescriptorSupplier("updateProject"))
                                    .build();
                }
            }
        }
        return getUpdateProjectMethod;
    }

    private static volatile io.grpc.MethodDescriptor<Project,
            Response> getDeleteProjectMethod;

    @io.grpc.stub.annotations.RpcMethod(
            fullMethodName = SERVICE_NAME + '/' + "deleteProject",
            requestType = Project.class,
            responseType = Response.class,
            methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
    public static io.grpc.MethodDescriptor<Project,
            Response> getDeleteProjectMethod() {
        io.grpc.MethodDescriptor<Project, Response> getDeleteProjectMethod;
        if ((getDeleteProjectMethod = MyServiceGrpc.getDeleteProjectMethod) == null) {
            synchronized (MyServiceGrpc.class) {
                if ((getDeleteProjectMethod = MyServiceGrpc.getDeleteProjectMethod) == null) {
                    MyServiceGrpc.getDeleteProjectMethod = getDeleteProjectMethod =
                            io.grpc.MethodDescriptor.<Project, Response>newBuilder()
                                    .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                                    .setFullMethodName(generateFullMethodName(SERVICE_NAME, "deleteProject"))
                                    .setSampledToLocalTracing(true)
                                    .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                                            Project.getDefaultInstance()))
                                    .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                                            Response.getDefaultInstance()))
                                    .setSchemaDescriptor(new MyServiceMethodDescriptorSupplier("deleteProject"))
                                    .build();
                }
            }
        }
        return getDeleteProjectMethod;
    }

    private static volatile io.grpc.MethodDescriptor<Group,
            Response> getAddGroupMethod;

    @io.grpc.stub.annotations.RpcMethod(
            fullMethodName = SERVICE_NAME + '/' + "addGroup",
            requestType = Group.class,
            responseType = Response.class,
            methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
    public static io.grpc.MethodDescriptor<Group,
            Response> getAddGroupMethod() {
        io.grpc.MethodDescriptor<Group, Response> getAddGroupMethod;
        if ((getAddGroupMethod = MyServiceGrpc.getAddGroupMethod) == null) {
            synchronized (MyServiceGrpc.class) {
                if ((getAddGroupMethod = MyServiceGrpc.getAddGroupMethod) == null) {
                    MyServiceGrpc.getAddGroupMethod = getAddGroupMethod =
                            io.grpc.MethodDescriptor.<Group, Response>newBuilder()
                                    .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                                    .setFullMethodName(generateFullMethodName(SERVICE_NAME, "addGroup"))
                                    .setSampledToLocalTracing(true)
                                    .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                                            Group.getDefaultInstance()))
                                    .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                                            Response.getDefaultInstance()))
                                    .setSchemaDescriptor(new MyServiceMethodDescriptorSupplier("addGroup"))
                                    .build();
                }
            }
        }
        return getAddGroupMethod;
    }

    private static volatile io.grpc.MethodDescriptor<Group,
            Response> getUpdateGroupMethod;

    @io.grpc.stub.annotations.RpcMethod(
            fullMethodName = SERVICE_NAME + '/' + "updateGroup",
            requestType = Group.class,
            responseType = Response.class,
            methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
    public static io.grpc.MethodDescriptor<Group,
            Response> getUpdateGroupMethod() {
        io.grpc.MethodDescriptor<Group, Response> getUpdateGroupMethod;
        if ((getUpdateGroupMethod = MyServiceGrpc.getUpdateGroupMethod) == null) {
            synchronized (MyServiceGrpc.class) {
                if ((getUpdateGroupMethod = MyServiceGrpc.getUpdateGroupMethod) == null) {
                    MyServiceGrpc.getUpdateGroupMethod = getUpdateGroupMethod =
                            io.grpc.MethodDescriptor.<Group, Response>newBuilder()
                                    .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                                    .setFullMethodName(generateFullMethodName(SERVICE_NAME, "updateGroup"))
                                    .setSampledToLocalTracing(true)
                                    .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                                            Group.getDefaultInstance()))
                                    .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                                            Response.getDefaultInstance()))
                                    .setSchemaDescriptor(new MyServiceMethodDescriptorSupplier("updateGroup"))
                                    .build();
                }
            }
        }
        return getUpdateGroupMethod;
    }

    private static volatile io.grpc.MethodDescriptor<Group,
            Response> getDeleteGroupMethod;

    @io.grpc.stub.annotations.RpcMethod(
            fullMethodName = SERVICE_NAME + '/' + "deleteGroup",
            requestType = Group.class,
            responseType = Response.class,
            methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
    public static io.grpc.MethodDescriptor<Group,
            Response> getDeleteGroupMethod() {
        io.grpc.MethodDescriptor<Group, Response> getDeleteGroupMethod;
        if ((getDeleteGroupMethod = MyServiceGrpc.getDeleteGroupMethod) == null) {
            synchronized (MyServiceGrpc.class) {
                if ((getDeleteGroupMethod = MyServiceGrpc.getDeleteGroupMethod) == null) {
                    MyServiceGrpc.getDeleteGroupMethod = getDeleteGroupMethod =
                            io.grpc.MethodDescriptor.<Group, Response>newBuilder()
                                    .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                                    .setFullMethodName(generateFullMethodName(SERVICE_NAME, "deleteGroup"))
                                    .setSampledToLocalTracing(true)
                                    .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                                            Group.getDefaultInstance()))
                                    .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                                            Response.getDefaultInstance()))
                                    .setSchemaDescriptor(new MyServiceMethodDescriptorSupplier("deleteGroup"))
                                    .build();
                }
            }
        }
        return getDeleteGroupMethod;
    }

    /**
     * Creates a new async stub that supports all call types for the service
     */
    public static MyServiceStub newStub(io.grpc.Channel channel) {
        io.grpc.stub.AbstractStub.StubFactory<MyServiceStub> factory =
                new io.grpc.stub.AbstractStub.StubFactory<MyServiceStub>() {
                    @Override
                    public MyServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
                        return new MyServiceStub(channel, callOptions);
                    }
                };
        return MyServiceStub.newStub(factory, channel);
    }

    /**
     * Creates a new blocking-style stub that supports unary and streaming output calls on the service
     */
    public static MyServiceBlockingStub newBlockingStub(
            io.grpc.Channel channel) {
        io.grpc.stub.AbstractStub.StubFactory<MyServiceBlockingStub> factory =
                new io.grpc.stub.AbstractStub.StubFactory<MyServiceBlockingStub>() {
                    @Override
                    public MyServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
                        return new MyServiceBlockingStub(channel, callOptions);
                    }
                };
        return MyServiceBlockingStub.newStub(factory, channel);
    }

    /**
     * Creates a new ListenableFuture-style stub that supports unary calls on the service
     */
    public static MyServiceFutureStub newFutureStub(
            io.grpc.Channel channel) {
        io.grpc.stub.AbstractStub.StubFactory<MyServiceFutureStub> factory =
                new io.grpc.stub.AbstractStub.StubFactory<MyServiceFutureStub>() {
                    @Override
                    public MyServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
                        return new MyServiceFutureStub(channel, callOptions);
                    }
                };
        return MyServiceFutureStub.newStub(factory, channel);
    }

    /**
     * <pre>
     * Interface exported by the server.
     * </pre>
     */
    public static abstract class MyServiceImplBase implements io.grpc.BindableService {

        /**
         *
         */
        public void addProject(Project request,
                               io.grpc.stub.StreamObserver<Response> responseObserver) {
            asyncUnimplementedUnaryCall(getAddProjectMethod(), responseObserver);
        }

        /**
         *
         */
        public void getProjects(Request request,
                                io.grpc.stub.StreamObserver<Project> responseObserver) {
            asyncUnimplementedUnaryCall(getGetProjectsMethod(), responseObserver);
        }

        /**
         * <pre>
         * with api get when type_request=0(getAll) type_request&gt;0(get 1 phan tu id=type_request)
         * if type_request=0 use page and max_item_in_page to pagination
         * </pre>
         */
        public void getGroups(Request request,
                              io.grpc.stub.StreamObserver<Group> responseObserver) {
            asyncUnimplementedUnaryCall(getGetGroupsMethod(), responseObserver);
        }

        /**
         *
         */
        public void updateProject(Project request,
                                  io.grpc.stub.StreamObserver<Response> responseObserver) {
            asyncUnimplementedUnaryCall(getUpdateProjectMethod(), responseObserver);
        }

        /**
         *
         */
        public void deleteProject(Project request,
                                  io.grpc.stub.StreamObserver<Response> responseObserver) {
            asyncUnimplementedUnaryCall(getDeleteProjectMethod(), responseObserver);
        }

        /**
         *
         */
        public void addGroup(Group request,
                             io.grpc.stub.StreamObserver<Response> responseObserver) {
            asyncUnimplementedUnaryCall(getAddGroupMethod(), responseObserver);
        }

        /**
         *
         */
        public void updateGroup(Group request,
                                io.grpc.stub.StreamObserver<Response> responseObserver) {
            asyncUnimplementedUnaryCall(getUpdateGroupMethod(), responseObserver);
        }

        /**
         *
         */
        public void deleteGroup(Group request,
                                io.grpc.stub.StreamObserver<Response> responseObserver) {
            asyncUnimplementedUnaryCall(getDeleteGroupMethod(), responseObserver);
        }

        @Override
        public final io.grpc.ServerServiceDefinition bindService() {
            return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
                    .addMethod(
                            getAddProjectMethod(),
                            ServerCalls.asyncUnaryCall(
                                    new MethodHandlers<
                                            Project,
                                            Response>(
                                            this, METHODID_ADD_PROJECT)))
                    .addMethod(
                            getGetProjectsMethod(),
                            ServerCalls.asyncServerStreamingCall(
                                    new MethodHandlers<
                                            Request,
                                            Project>(
                                            this, METHODID_GET_PROJECTS)))
                    .addMethod(
                            getGetGroupsMethod(),
                            ServerCalls.asyncServerStreamingCall(
                                    new MethodHandlers<
                                            Request,
                                            Group>(
                                            this, METHODID_GET_GROUPS)))
                    .addMethod(
                            getUpdateProjectMethod(),
                            ServerCalls.asyncUnaryCall(
                                    new MethodHandlers<
                                            Project,
                                            Response>(
                                            this, METHODID_UPDATE_PROJECT)))
                    .addMethod(
                            getDeleteProjectMethod(),
                            ServerCalls.asyncUnaryCall(
                                    new MethodHandlers<
                                            Project,
                                            Response>(
                                            this, METHODID_DELETE_PROJECT)))
                    .addMethod(
                            getAddGroupMethod(),
                            ServerCalls.asyncUnaryCall(
                                    new MethodHandlers<
                                            Group,
                                            Response>(
                                            this, METHODID_ADD_GROUP)))
                    .addMethod(
                            getUpdateGroupMethod(),
                            ServerCalls.asyncUnaryCall(
                                    new MethodHandlers<
                                            Group,
                                            Response>(
                                            this, METHODID_UPDATE_GROUP)))
                    .addMethod(
                            getDeleteGroupMethod(),
                            ServerCalls.asyncUnaryCall(
                                    new MethodHandlers<
                                            Group,
                                            Response>(
                                            this, METHODID_DELETE_GROUP)))
                    .build();
        }
    }

    /**
     * <pre>
     * Interface exported by the server.
     * </pre>
     */
    public static final class MyServiceStub extends io.grpc.stub.AbstractAsyncStub<MyServiceStub> {
        private MyServiceStub(
                io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
            super(channel, callOptions);
        }

        @Override
        protected MyServiceStub build(
                io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
            return new MyServiceStub(channel, callOptions);
        }

        /**
         *
         */
        public void addProject(Project request,
                               io.grpc.stub.StreamObserver<Response> responseObserver) {
            asyncUnaryCall(
                    getChannel().newCall(getAddProjectMethod(), getCallOptions()), request, responseObserver);
        }

        /**
         *
         */
        public void getProjects(Request request,
                                io.grpc.stub.StreamObserver<Project> responseObserver) {
            asyncServerStreamingCall(
                    getChannel().newCall(getGetProjectsMethod(), getCallOptions()), request, responseObserver);
        }

        /**
         * <pre>
         * with api get when type_request=0(getAll) type_request&gt;0(get 1 phan tu id=type_request)
         * if type_request=0 use page and max_item_in_page to pagination
         * </pre>
         */
        public void getGroups(Request request,
                              io.grpc.stub.StreamObserver<Group> responseObserver) {
            asyncServerStreamingCall(
                    getChannel().newCall(getGetGroupsMethod(), getCallOptions()), request, responseObserver);
        }

        /**
         *
         */
        public void updateProject(Project request,
                                  io.grpc.stub.StreamObserver<Response> responseObserver) {
            asyncUnaryCall(
                    getChannel().newCall(getUpdateProjectMethod(), getCallOptions()), request, responseObserver);
        }

        /**
         *
         */
        public void deleteProject(Project request,
                                  io.grpc.stub.StreamObserver<Response> responseObserver) {
            asyncUnaryCall(
                    getChannel().newCall(getDeleteProjectMethod(), getCallOptions()), request, responseObserver);
        }

        /**
         *
         */
        public void addGroup(Group request,
                             io.grpc.stub.StreamObserver<Response> responseObserver) {
            asyncUnaryCall(
                    getChannel().newCall(getAddGroupMethod(), getCallOptions()), request, responseObserver);
        }

        /**
         *
         */
        public void updateGroup(Group request,
                                io.grpc.stub.StreamObserver<Response> responseObserver) {
            asyncUnaryCall(
                    getChannel().newCall(getUpdateGroupMethod(), getCallOptions()), request, responseObserver);
        }

        /**
         *
         */
        public void deleteGroup(Group request,
                                io.grpc.stub.StreamObserver<Response> responseObserver) {
            asyncUnaryCall(
                    getChannel().newCall(getDeleteGroupMethod(), getCallOptions()), request, responseObserver);
        }
    }

    /**
     * <pre>
     * Interface exported by the server.
     * </pre>
     */
    public static final class MyServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<MyServiceBlockingStub> {
        private MyServiceBlockingStub(
                io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
            super(channel, callOptions);
        }

        @Override
        protected MyServiceBlockingStub build(
                io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
            return new MyServiceBlockingStub(channel, callOptions);
        }

        /**
         *
         */
        public Response addProject(Project request) {
            return blockingUnaryCall(
                    getChannel(), getAddProjectMethod(), getCallOptions(), request);
        }

        /**
         *
         */
        public java.util.Iterator<Project> getProjects(
                Request request) {
            return blockingServerStreamingCall(
                    getChannel(), getGetProjectsMethod(), getCallOptions(), request);
        }

        /**
         * <pre>
         * with api get when type_request=0(getAll) type_request&gt;0(get 1 phan tu id=type_request)
         * if type_request=0 use page and max_item_in_page to pagination
         * </pre>
         */
        public java.util.Iterator<Group> getGroups(
                Request request) {
            return blockingServerStreamingCall(
                    getChannel(), getGetGroupsMethod(), getCallOptions(), request);
        }

        /**
         *
         */
        public Response updateProject(Project request) {
            return blockingUnaryCall(
                    getChannel(), getUpdateProjectMethod(), getCallOptions(), request);
        }

        /**
         *
         */
        public Response deleteProject(Project request) {
            return blockingUnaryCall(
                    getChannel(), getDeleteProjectMethod(), getCallOptions(), request);
        }

        /**
         *
         */
        public Response addGroup(Group request) {
            return blockingUnaryCall(
                    getChannel(), getAddGroupMethod(), getCallOptions(), request);
        }

        /**
         *
         */
        public Response updateGroup(Group request) {
            return blockingUnaryCall(
                    getChannel(), getUpdateGroupMethod(), getCallOptions(), request);
        }

        /**
         *
         */
        public Response deleteGroup(Group request) {
            return blockingUnaryCall(
                    getChannel(), getDeleteGroupMethod(), getCallOptions(), request);
        }
    }

    /**
     * <pre>
     * Interface exported by the server.
     * </pre>
     */
    public static final class MyServiceFutureStub extends io.grpc.stub.AbstractFutureStub<MyServiceFutureStub> {
        private MyServiceFutureStub(
                io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
            super(channel, callOptions);
        }

        @Override
        protected MyServiceFutureStub build(
                io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
            return new MyServiceFutureStub(channel, callOptions);
        }

        /**
         *
         */
        public com.google.common.util.concurrent.ListenableFuture<Response> addProject(
                Project request) {
            return futureUnaryCall(
                    getChannel().newCall(getAddProjectMethod(), getCallOptions()), request);
        }

        /**
         *
         */
        public com.google.common.util.concurrent.ListenableFuture<Response> updateProject(
                Project request) {
            return futureUnaryCall(
                    getChannel().newCall(getUpdateProjectMethod(), getCallOptions()), request);
        }

        /**
         *
         */
        public com.google.common.util.concurrent.ListenableFuture<Response> deleteProject(
                Project request) {
            return futureUnaryCall(
                    getChannel().newCall(getDeleteProjectMethod(), getCallOptions()), request);
        }

        /**
         *
         */
        public com.google.common.util.concurrent.ListenableFuture<Response> addGroup(
                Group request) {
            return futureUnaryCall(
                    getChannel().newCall(getAddGroupMethod(), getCallOptions()), request);
        }

        /**
         *
         */
        public com.google.common.util.concurrent.ListenableFuture<Response> updateGroup(
                Group request) {
            return futureUnaryCall(
                    getChannel().newCall(getUpdateGroupMethod(), getCallOptions()), request);
        }

        /**
         *
         */
        public com.google.common.util.concurrent.ListenableFuture<Response> deleteGroup(
                Group request) {
            return futureUnaryCall(
                    getChannel().newCall(getDeleteGroupMethod(), getCallOptions()), request);
        }
    }

    private static final int METHODID_ADD_PROJECT = 0;
    private static final int METHODID_GET_PROJECTS = 1;
    private static final int METHODID_GET_GROUPS = 2;
    private static final int METHODID_UPDATE_PROJECT = 3;
    private static final int METHODID_DELETE_PROJECT = 4;
    private static final int METHODID_ADD_GROUP = 5;
    private static final int METHODID_UPDATE_GROUP = 6;
    private static final int METHODID_DELETE_GROUP = 7;

    private static final class MethodHandlers<Req, Resp> implements
            UnaryMethod<Req, Resp>,
            ServerStreamingMethod<Req, Resp>,
            ClientStreamingMethod<Req, Resp>,
            BidiStreamingMethod<Req, Resp> {
        private final MyServiceImplBase serviceImpl;
        private final int methodId;

        MethodHandlers(MyServiceImplBase serviceImpl, int methodId) {
            this.serviceImpl = serviceImpl;
            this.methodId = methodId;
        }

        @Override
        @SuppressWarnings("unchecked")
        public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
            switch (methodId) {
                case METHODID_ADD_PROJECT:
                    serviceImpl.addProject((Project) request,
                            (io.grpc.stub.StreamObserver<Response>) responseObserver);
                    break;
                case METHODID_GET_PROJECTS:
                    serviceImpl.getProjects((Request) request,
                            (io.grpc.stub.StreamObserver<Project>) responseObserver);
                    break;
                case METHODID_GET_GROUPS:
                    serviceImpl.getGroups((Request) request,
                            (io.grpc.stub.StreamObserver<Group>) responseObserver);
                    break;
                case METHODID_UPDATE_PROJECT:
                    serviceImpl.updateProject((Project) request,
                            (io.grpc.stub.StreamObserver<Response>) responseObserver);
                    break;
                case METHODID_DELETE_PROJECT:
                    serviceImpl.deleteProject((Project) request,
                            (io.grpc.stub.StreamObserver<Response>) responseObserver);
                    break;
                case METHODID_ADD_GROUP:
                    serviceImpl.addGroup((Group) request,
                            (io.grpc.stub.StreamObserver<Response>) responseObserver);
                    break;
                case METHODID_UPDATE_GROUP:
                    serviceImpl.updateGroup((Group) request,
                            (io.grpc.stub.StreamObserver<Response>) responseObserver);
                    break;
                case METHODID_DELETE_GROUP:
                    serviceImpl.deleteGroup((Group) request,
                            (io.grpc.stub.StreamObserver<Response>) responseObserver);
                    break;
                default:
                    throw new AssertionError();
            }
        }

        @Override
        @SuppressWarnings("unchecked")
        public io.grpc.stub.StreamObserver<Req> invoke(
                io.grpc.stub.StreamObserver<Resp> responseObserver) {
            switch (methodId) {
                default:
                    throw new AssertionError();
            }
        }
    }

    private static abstract class MyServiceBaseDescriptorSupplier
            implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
        MyServiceBaseDescriptorSupplier() {
        }

        @Override
        public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
            return MyProto.getDescriptor();
        }

        @Override
        public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
            return getFileDescriptor().findServiceByName("MyService");
        }
    }

    private static final class MyServiceFileDescriptorSupplier
            extends MyServiceBaseDescriptorSupplier {
        MyServiceFileDescriptorSupplier() {
        }
    }

    private static final class MyServiceMethodDescriptorSupplier
            extends MyServiceBaseDescriptorSupplier
            implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
        private final String methodName;

        MyServiceMethodDescriptorSupplier(String methodName) {
            this.methodName = methodName;
        }

        @Override
        public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
            return getServiceDescriptor().findMethodByName(methodName);
        }
    }

    private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

    public static io.grpc.ServiceDescriptor getServiceDescriptor() {
        io.grpc.ServiceDescriptor result = serviceDescriptor;
        if (result == null) {
            synchronized (MyServiceGrpc.class) {
                result = serviceDescriptor;
                if (result == null) {
                    serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
                            .setSchemaDescriptor(new MyServiceFileDescriptorSupplier())
                            .addMethod(getAddProjectMethod())
                            .addMethod(getGetProjectsMethod())
                            .addMethod(getGetGroupsMethod())
                            .addMethod(getUpdateProjectMethod())
                            .addMethod(getDeleteProjectMethod())
                            .addMethod(getAddGroupMethod())
                            .addMethod(getUpdateGroupMethod())
                            .addMethod(getDeleteGroupMethod())
                            .build();
                }
            }
        }
        return result;
    }
}
