// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ImageService.proto

package proto;

public interface ImageSaveResultOrBuilder extends
    // @@protoc_insertion_point(interface_extends:com.skynet.commons.grpc.dipper.proto.ImageSaveResult)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>int32 rpc_code = 1;</code>
   * @return The rpcCode.
   */
  int getRpcCode();

  /**
   * <code>string message = 2;</code>
   * @return The message.
   */
  String getMessage();
  /**
   * <code>string message = 2;</code>
   * @return The bytes for message.
   */
  com.google.protobuf.ByteString
      getMessageBytes();

  /**
   * <code>string url = 3;</code>
   * @return The url.
   */
  String getUrl();
  /**
   * <code>string url = 3;</code>
   * @return The bytes for url.
   */
  com.google.protobuf.ByteString
      getUrlBytes();
}
