// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: BlogService.proto

package proto;

public final class BlogProto {
  private BlogProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_skynet_commons_grpc_dipper_proto_BlogPro_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_skynet_commons_grpc_dipper_proto_BlogPro_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    String[] descriptorData = {
      "\n\021BlogService.proto\022$com.skynet.commons." +
      "grpc.dipper.proto\"[\n\007BlogPro\022\n\n\002id\030\001 \001(\005" +
      "\022\017\n\007user_id\030\002 \001(\005\022\016\n\006header\030\003 \001(\t\022\017\n\007con" +
      "tent\030\004 \001(\t\022\022\n\nbuild_time\030\005 \001(\t2\r\n\013BlogSe" +
      "rviceB3\n$com.skynet.commons.grpc.dipper." +
      "protoB\tBlogProtoP\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_com_skynet_commons_grpc_dipper_proto_BlogPro_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_com_skynet_commons_grpc_dipper_proto_BlogPro_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_skynet_commons_grpc_dipper_proto_BlogPro_descriptor,
        new String[] { "Id", "UserId", "Header", "Content", "BuildTime", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
