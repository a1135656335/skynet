// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ImageService.proto

package com.skynet.dipper.commons.grpc.image;

public interface ImageDataOrBuilder extends
    // @@protoc_insertion_point(interface_extends:com.skynet.dipper.commons.grpc.image.ImageData)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string name = 1;</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <code>string name = 1;</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <code>bytes photo = 2;</code>
   * @return The photo.
   */
  com.google.protobuf.ByteString getPhoto();
}
