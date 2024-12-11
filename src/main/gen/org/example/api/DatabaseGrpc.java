package org.example.api;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * the api of tron's db
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.60.0)",
    comments = "Source: api/api.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class DatabaseGrpc {

  private DatabaseGrpc() {}

  public static final java.lang.String SERVICE_NAME = "protocol.Database";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<org.example.api.GrpcAPI.EmptyMessage,
      org.example.api.GrpcAPI.BlockReference> getGetBlockReferenceMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getBlockReference",
      requestType = org.example.api.GrpcAPI.EmptyMessage.class,
      responseType = org.example.api.GrpcAPI.BlockReference.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.example.api.GrpcAPI.EmptyMessage,
      org.example.api.GrpcAPI.BlockReference> getGetBlockReferenceMethod() {
    io.grpc.MethodDescriptor<org.example.api.GrpcAPI.EmptyMessage, org.example.api.GrpcAPI.BlockReference> getGetBlockReferenceMethod;
    if ((getGetBlockReferenceMethod = DatabaseGrpc.getGetBlockReferenceMethod) == null) {
      synchronized (DatabaseGrpc.class) {
        if ((getGetBlockReferenceMethod = DatabaseGrpc.getGetBlockReferenceMethod) == null) {
          DatabaseGrpc.getGetBlockReferenceMethod = getGetBlockReferenceMethod =
              io.grpc.MethodDescriptor.<org.example.api.GrpcAPI.EmptyMessage, org.example.api.GrpcAPI.BlockReference>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "getBlockReference"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.api.GrpcAPI.EmptyMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.api.GrpcAPI.BlockReference.getDefaultInstance()))
              .setSchemaDescriptor(new DatabaseMethodDescriptorSupplier("getBlockReference"))
              .build();
        }
      }
    }
    return getGetBlockReferenceMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.example.api.GrpcAPI.EmptyMessage,
      org.example.protos.Protocol.DynamicProperties> getGetDynamicPropertiesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetDynamicProperties",
      requestType = org.example.api.GrpcAPI.EmptyMessage.class,
      responseType = org.example.protos.Protocol.DynamicProperties.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.example.api.GrpcAPI.EmptyMessage,
      org.example.protos.Protocol.DynamicProperties> getGetDynamicPropertiesMethod() {
    io.grpc.MethodDescriptor<org.example.api.GrpcAPI.EmptyMessage, org.example.protos.Protocol.DynamicProperties> getGetDynamicPropertiesMethod;
    if ((getGetDynamicPropertiesMethod = DatabaseGrpc.getGetDynamicPropertiesMethod) == null) {
      synchronized (DatabaseGrpc.class) {
        if ((getGetDynamicPropertiesMethod = DatabaseGrpc.getGetDynamicPropertiesMethod) == null) {
          DatabaseGrpc.getGetDynamicPropertiesMethod = getGetDynamicPropertiesMethod =
              io.grpc.MethodDescriptor.<org.example.api.GrpcAPI.EmptyMessage, org.example.protos.Protocol.DynamicProperties>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetDynamicProperties"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.api.GrpcAPI.EmptyMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.protos.Protocol.DynamicProperties.getDefaultInstance()))
              .setSchemaDescriptor(new DatabaseMethodDescriptorSupplier("GetDynamicProperties"))
              .build();
        }
      }
    }
    return getGetDynamicPropertiesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.example.api.GrpcAPI.EmptyMessage,
      org.example.protos.Protocol.Block> getGetNowBlockMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetNowBlock",
      requestType = org.example.api.GrpcAPI.EmptyMessage.class,
      responseType = org.example.protos.Protocol.Block.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.example.api.GrpcAPI.EmptyMessage,
      org.example.protos.Protocol.Block> getGetNowBlockMethod() {
    io.grpc.MethodDescriptor<org.example.api.GrpcAPI.EmptyMessage, org.example.protos.Protocol.Block> getGetNowBlockMethod;
    if ((getGetNowBlockMethod = DatabaseGrpc.getGetNowBlockMethod) == null) {
      synchronized (DatabaseGrpc.class) {
        if ((getGetNowBlockMethod = DatabaseGrpc.getGetNowBlockMethod) == null) {
          DatabaseGrpc.getGetNowBlockMethod = getGetNowBlockMethod =
              io.grpc.MethodDescriptor.<org.example.api.GrpcAPI.EmptyMessage, org.example.protos.Protocol.Block>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetNowBlock"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.api.GrpcAPI.EmptyMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.protos.Protocol.Block.getDefaultInstance()))
              .setSchemaDescriptor(new DatabaseMethodDescriptorSupplier("GetNowBlock"))
              .build();
        }
      }
    }
    return getGetNowBlockMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.example.api.GrpcAPI.NumberMessage,
      org.example.protos.Protocol.Block> getGetBlockByNumMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetBlockByNum",
      requestType = org.example.api.GrpcAPI.NumberMessage.class,
      responseType = org.example.protos.Protocol.Block.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.example.api.GrpcAPI.NumberMessage,
      org.example.protos.Protocol.Block> getGetBlockByNumMethod() {
    io.grpc.MethodDescriptor<org.example.api.GrpcAPI.NumberMessage, org.example.protos.Protocol.Block> getGetBlockByNumMethod;
    if ((getGetBlockByNumMethod = DatabaseGrpc.getGetBlockByNumMethod) == null) {
      synchronized (DatabaseGrpc.class) {
        if ((getGetBlockByNumMethod = DatabaseGrpc.getGetBlockByNumMethod) == null) {
          DatabaseGrpc.getGetBlockByNumMethod = getGetBlockByNumMethod =
              io.grpc.MethodDescriptor.<org.example.api.GrpcAPI.NumberMessage, org.example.protos.Protocol.Block>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetBlockByNum"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.api.GrpcAPI.NumberMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.protos.Protocol.Block.getDefaultInstance()))
              .setSchemaDescriptor(new DatabaseMethodDescriptorSupplier("GetBlockByNum"))
              .build();
        }
      }
    }
    return getGetBlockByNumMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static DatabaseStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<DatabaseStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<DatabaseStub>() {
        @java.lang.Override
        public DatabaseStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new DatabaseStub(channel, callOptions);
        }
      };
    return DatabaseStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static DatabaseBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<DatabaseBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<DatabaseBlockingStub>() {
        @java.lang.Override
        public DatabaseBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new DatabaseBlockingStub(channel, callOptions);
        }
      };
    return DatabaseBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static DatabaseFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<DatabaseFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<DatabaseFutureStub>() {
        @java.lang.Override
        public DatabaseFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new DatabaseFutureStub(channel, callOptions);
        }
      };
    return DatabaseFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * the api of tron's db
   * </pre>
   */
  public interface AsyncService {

    /**
     * <pre>
     * for tapos
     * </pre>
     */
    default void getBlockReference(org.example.api.GrpcAPI.EmptyMessage request,
        io.grpc.stub.StreamObserver<org.example.api.GrpcAPI.BlockReference> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetBlockReferenceMethod(), responseObserver);
    }

    /**
     */
    default void getDynamicProperties(org.example.api.GrpcAPI.EmptyMessage request,
        io.grpc.stub.StreamObserver<org.example.protos.Protocol.DynamicProperties> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetDynamicPropertiesMethod(), responseObserver);
    }

    /**
     */
    default void getNowBlock(org.example.api.GrpcAPI.EmptyMessage request,
        io.grpc.stub.StreamObserver<org.example.protos.Protocol.Block> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetNowBlockMethod(), responseObserver);
    }

    /**
     */
    default void getBlockByNum(org.example.api.GrpcAPI.NumberMessage request,
        io.grpc.stub.StreamObserver<org.example.protos.Protocol.Block> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetBlockByNumMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service Database.
   * <pre>
   * the api of tron's db
   * </pre>
   */
  public static abstract class DatabaseImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return DatabaseGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service Database.
   * <pre>
   * the api of tron's db
   * </pre>
   */
  public static final class DatabaseStub
      extends io.grpc.stub.AbstractAsyncStub<DatabaseStub> {
    private DatabaseStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DatabaseStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new DatabaseStub(channel, callOptions);
    }

    /**
     * <pre>
     * for tapos
     * </pre>
     */
    public void getBlockReference(org.example.api.GrpcAPI.EmptyMessage request,
        io.grpc.stub.StreamObserver<org.example.api.GrpcAPI.BlockReference> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetBlockReferenceMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getDynamicProperties(org.example.api.GrpcAPI.EmptyMessage request,
        io.grpc.stub.StreamObserver<org.example.protos.Protocol.DynamicProperties> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetDynamicPropertiesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getNowBlock(org.example.api.GrpcAPI.EmptyMessage request,
        io.grpc.stub.StreamObserver<org.example.protos.Protocol.Block> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetNowBlockMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getBlockByNum(org.example.api.GrpcAPI.NumberMessage request,
        io.grpc.stub.StreamObserver<org.example.protos.Protocol.Block> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetBlockByNumMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service Database.
   * <pre>
   * the api of tron's db
   * </pre>
   */
  public static final class DatabaseBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<DatabaseBlockingStub> {
    private DatabaseBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DatabaseBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new DatabaseBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * for tapos
     * </pre>
     */
    public org.example.api.GrpcAPI.BlockReference getBlockReference(org.example.api.GrpcAPI.EmptyMessage request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetBlockReferenceMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.example.protos.Protocol.DynamicProperties getDynamicProperties(org.example.api.GrpcAPI.EmptyMessage request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetDynamicPropertiesMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.example.protos.Protocol.Block getNowBlock(org.example.api.GrpcAPI.EmptyMessage request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetNowBlockMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.example.protos.Protocol.Block getBlockByNum(org.example.api.GrpcAPI.NumberMessage request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetBlockByNumMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service Database.
   * <pre>
   * the api of tron's db
   * </pre>
   */
  public static final class DatabaseFutureStub
      extends io.grpc.stub.AbstractFutureStub<DatabaseFutureStub> {
    private DatabaseFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DatabaseFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new DatabaseFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * for tapos
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<org.example.api.GrpcAPI.BlockReference> getBlockReference(
        org.example.api.GrpcAPI.EmptyMessage request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetBlockReferenceMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.example.protos.Protocol.DynamicProperties> getDynamicProperties(
        org.example.api.GrpcAPI.EmptyMessage request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetDynamicPropertiesMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.example.protos.Protocol.Block> getNowBlock(
        org.example.api.GrpcAPI.EmptyMessage request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetNowBlockMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.example.protos.Protocol.Block> getBlockByNum(
        org.example.api.GrpcAPI.NumberMessage request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetBlockByNumMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_BLOCK_REFERENCE = 0;
  private static final int METHODID_GET_DYNAMIC_PROPERTIES = 1;
  private static final int METHODID_GET_NOW_BLOCK = 2;
  private static final int METHODID_GET_BLOCK_BY_NUM = 3;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final AsyncService serviceImpl;
    private final int methodId;

    MethodHandlers(AsyncService serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_BLOCK_REFERENCE:
          serviceImpl.getBlockReference((org.example.api.GrpcAPI.EmptyMessage) request,
              (io.grpc.stub.StreamObserver<org.example.api.GrpcAPI.BlockReference>) responseObserver);
          break;
        case METHODID_GET_DYNAMIC_PROPERTIES:
          serviceImpl.getDynamicProperties((org.example.api.GrpcAPI.EmptyMessage) request,
              (io.grpc.stub.StreamObserver<org.example.protos.Protocol.DynamicProperties>) responseObserver);
          break;
        case METHODID_GET_NOW_BLOCK:
          serviceImpl.getNowBlock((org.example.api.GrpcAPI.EmptyMessage) request,
              (io.grpc.stub.StreamObserver<org.example.protos.Protocol.Block>) responseObserver);
          break;
        case METHODID_GET_BLOCK_BY_NUM:
          serviceImpl.getBlockByNum((org.example.api.GrpcAPI.NumberMessage) request,
              (io.grpc.stub.StreamObserver<org.example.protos.Protocol.Block>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  public static final io.grpc.ServerServiceDefinition bindService(AsyncService service) {
    return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
        .addMethod(
          getGetBlockReferenceMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              org.example.api.GrpcAPI.EmptyMessage,
              org.example.api.GrpcAPI.BlockReference>(
                service, METHODID_GET_BLOCK_REFERENCE)))
        .addMethod(
          getGetDynamicPropertiesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              org.example.api.GrpcAPI.EmptyMessage,
              org.example.protos.Protocol.DynamicProperties>(
                service, METHODID_GET_DYNAMIC_PROPERTIES)))
        .addMethod(
          getGetNowBlockMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              org.example.api.GrpcAPI.EmptyMessage,
              org.example.protos.Protocol.Block>(
                service, METHODID_GET_NOW_BLOCK)))
        .addMethod(
          getGetBlockByNumMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              org.example.api.GrpcAPI.NumberMessage,
              org.example.protos.Protocol.Block>(
                service, METHODID_GET_BLOCK_BY_NUM)))
        .build();
  }

  private static abstract class DatabaseBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    DatabaseBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return org.example.api.GrpcAPI.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Database");
    }
  }

  private static final class DatabaseFileDescriptorSupplier
      extends DatabaseBaseDescriptorSupplier {
    DatabaseFileDescriptorSupplier() {}
  }

  private static final class DatabaseMethodDescriptorSupplier
      extends DatabaseBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    DatabaseMethodDescriptorSupplier(java.lang.String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (DatabaseGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new DatabaseFileDescriptorSupplier())
              .addMethod(getGetBlockReferenceMethod())
              .addMethod(getGetDynamicPropertiesMethod())
              .addMethod(getGetNowBlockMethod())
              .addMethod(getGetBlockByNumMethod())
              .build();
        }
      }
    }
    return result;
  }
}
