// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: BaseService.proto

package proto;

public interface EntryOrBuilder extends
    // @@protoc_insertion_point(interface_extends:com.skynet.commons.grpc.dipper.proto.Entry)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.com.skynet.commons.grpc.dipper.proto.MessageType type = 1;</code>
   * @return The enum numeric value on the wire for type.
   */
  int getTypeValue();
  /**
   * <code>.com.skynet.commons.grpc.dipper.proto.MessageType type = 1;</code>
   * @return The type.
   */
  MessageType getType();

  /**
   * <code>.google.protobuf.Any entry = 2;</code>
   * @return Whether the entry field is set.
   */
  boolean hasEntry();
  /**
   * <code>.google.protobuf.Any entry = 2;</code>
   * @return The entry.
   */
  com.google.protobuf.Any getEntry();
  /**
   * <code>.google.protobuf.Any entry = 2;</code>
   */
  com.google.protobuf.AnyOrBuilder getEntryOrBuilder();
}
