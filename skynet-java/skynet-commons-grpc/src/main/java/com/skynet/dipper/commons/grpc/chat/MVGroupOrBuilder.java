// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ChatService.proto

package com.skynet.dipper.commons.grpc.chat;

public interface MVGroupOrBuilder extends
    // @@protoc_insertion_point(interface_extends:com.skynet.dipper.commons.grpc.chat.MVGroup)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>int32 id = 1;</code>
   * @return The id.
   */
  int getId();

  /**
   * <code>string groupname = 2;</code>
   * @return The groupname.
   */
  java.lang.String getGroupname();
  /**
   * <code>string groupname = 2;</code>
   * @return The bytes for groupname.
   */
  com.google.protobuf.ByteString
      getGroupnameBytes();

  /**
   * <code>string avatar = 3;</code>
   * @return The avatar.
   */
  java.lang.String getAvatar();
  /**
   * <code>string avatar = 3;</code>
   * @return The bytes for avatar.
   */
  com.google.protobuf.ByteString
      getAvatarBytes();
}
