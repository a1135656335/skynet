// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: UserService.proto

package com.skynet.dipper.commons.grpc.user;

public final class UserProto {
  private UserProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_skynet_dipper_commons_grpc_user_LoginInfo_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_skynet_dipper_commons_grpc_user_LoginInfo_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_skynet_dipper_commons_grpc_user_UserPro_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_skynet_dipper_commons_grpc_user_UserPro_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\021UserService.proto\022#com.skynet.dipper.c" +
      "ommons.grpc.user\032\021BaseService.proto\"0\n\tL" +
      "oginInfo\022\021\n\tuser_name\030\001 \001(\t\022\020\n\010password\030" +
      "\002 \001(\t\"\275\001\n\007UserPro\022\n\n\002id\030\001 \001(\005\022\021\n\tuser_na" +
      "me\030\002 \001(\t\022\020\n\010password\030\003 \001(\t\022\021\n\tnick_name\030" +
      "\004 \001(\t\022\016\n\006gender\030\005 \001(\005\022\016\n\006avatar\030\006 \001(\t\022\r\n" +
      "\005email\030\007 \001(\t\022\r\n\005phone\030\010 \001(\t\022\021\n\trole_code" +
      "\030\t \001(\t\022\017\n\007version\030\n \001(\t\022\014\n\004sign\030\013 \001(\t2x\n" +
      "\013UserService\022i\n\005login\022..com.skynet.dippe" +
      "r.commons.grpc.user.LoginInfo\032..com.skyn" +
      "et.dipper.commons.grpc.base.RpcResult\"\000B" +
      "2\n#com.skynet.dipper.commons.grpc.userB\t" +
      "UserProtoP\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.skynet.dipper.commons.grpc.base.BaseServiceProto.getDescriptor(),
        });
    internal_static_com_skynet_dipper_commons_grpc_user_LoginInfo_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_com_skynet_dipper_commons_grpc_user_LoginInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_skynet_dipper_commons_grpc_user_LoginInfo_descriptor,
        new java.lang.String[] { "UserName", "Password", });
    internal_static_com_skynet_dipper_commons_grpc_user_UserPro_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_com_skynet_dipper_commons_grpc_user_UserPro_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_skynet_dipper_commons_grpc_user_UserPro_descriptor,
        new java.lang.String[] { "Id", "UserName", "Password", "NickName", "Gender", "Avatar", "Email", "Phone", "RoleCode", "Version", "Sign", });
    com.skynet.dipper.commons.grpc.base.BaseServiceProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
