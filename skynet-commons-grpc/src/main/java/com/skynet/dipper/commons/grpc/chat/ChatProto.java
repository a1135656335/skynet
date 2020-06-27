// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ChatService.proto

package com.skynet.dipper.commons.grpc.chat;

public final class ChatProto {
  private ChatProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_skynet_dipper_commons_grpc_chat_UserId_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_skynet_dipper_commons_grpc_chat_UserId_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_skynet_dipper_commons_grpc_chat_MVUser_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_skynet_dipper_commons_grpc_chat_MVUser_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_skynet_dipper_commons_grpc_chat_MVFriend_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_skynet_dipper_commons_grpc_chat_MVFriend_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_skynet_dipper_commons_grpc_chat_MVGroup_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_skynet_dipper_commons_grpc_chat_MVGroup_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_skynet_dipper_commons_grpc_chat_MVData_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_skynet_dipper_commons_grpc_chat_MVData_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_skynet_dipper_commons_grpc_chat_MVInit_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_skynet_dipper_commons_grpc_chat_MVInit_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\021ChatService.proto\022#com.skynet.dipper.c" +
      "ommons.grpc.chat\"\024\n\006UserId\022\n\n\002id\030\001 \001(\005\"T" +
      "\n\006MVUser\022\n\n\002id\030\001 \001(\005\022\020\n\010username\030\002 \001(\t\022\016" +
      "\n\006status\030\003 \001(\t\022\014\n\004sign\030\004 \001(\t\022\016\n\006avatar\030\005" +
      " \001(\t\"t\n\010MVFriend\022\021\n\tgroupname\030\001 \001(\t\022\n\n\002i" +
      "d\030\002 \001(\005\022\016\n\006online\030\003 \001(\005\0229\n\004list\030\004 \003(\0132+." +
      "com.skynet.dipper.commons.grpc.chat.MVUs" +
      "er\"8\n\007MVGroup\022\n\n\002id\030\001 \001(\005\022\021\n\tgroupname\030\002" +
      " \001(\t\022\016\n\006avatar\030\003 \001(\t\"\277\001\n\006MVData\0229\n\004mine\030" +
      "\001 \001(\0132+.com.skynet.dipper.commons.grpc.c" +
      "hat.MVUser\022=\n\006friend\030\002 \003(\0132-.com.skynet." +
      "dipper.commons.grpc.chat.MVFriend\022;\n\005gro" +
      "up\030\003 \003(\0132,.com.skynet.dipper.commons.grp" +
      "c.chat.MVGroup\"\\\n\006MVInit\022\n\n\002id\030\001 \001(\005\022\013\n\003" +
      "msg\030\002 \001(\t\0229\n\004data\030\003 \001(\0132+.com.skynet.dip" +
      "per.commons.grpc.chat.MVData2q\n\013ChatServ" +
      "ice\022b\n\004init\022+.com.skynet.dipper.commons." +
      "grpc.chat.UserId\032+.com.skynet.dipper.com" +
      "mons.grpc.chat.MVInit\"\000B2\n#com.skynet.di" +
      "pper.commons.grpc.chatB\tChatProtoP\001b\006pro" +
      "to3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_com_skynet_dipper_commons_grpc_chat_UserId_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_com_skynet_dipper_commons_grpc_chat_UserId_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_skynet_dipper_commons_grpc_chat_UserId_descriptor,
        new java.lang.String[] { "Id", });
    internal_static_com_skynet_dipper_commons_grpc_chat_MVUser_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_com_skynet_dipper_commons_grpc_chat_MVUser_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_skynet_dipper_commons_grpc_chat_MVUser_descriptor,
        new java.lang.String[] { "Id", "Username", "Status", "Sign", "Avatar", });
    internal_static_com_skynet_dipper_commons_grpc_chat_MVFriend_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_com_skynet_dipper_commons_grpc_chat_MVFriend_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_skynet_dipper_commons_grpc_chat_MVFriend_descriptor,
        new java.lang.String[] { "Groupname", "Id", "Online", "List", });
    internal_static_com_skynet_dipper_commons_grpc_chat_MVGroup_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_com_skynet_dipper_commons_grpc_chat_MVGroup_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_skynet_dipper_commons_grpc_chat_MVGroup_descriptor,
        new java.lang.String[] { "Id", "Groupname", "Avatar", });
    internal_static_com_skynet_dipper_commons_grpc_chat_MVData_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_com_skynet_dipper_commons_grpc_chat_MVData_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_skynet_dipper_commons_grpc_chat_MVData_descriptor,
        new java.lang.String[] { "Mine", "Friend", "Group", });
    internal_static_com_skynet_dipper_commons_grpc_chat_MVInit_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_com_skynet_dipper_commons_grpc_chat_MVInit_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_skynet_dipper_commons_grpc_chat_MVInit_descriptor,
        new java.lang.String[] { "Id", "Msg", "Data", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
