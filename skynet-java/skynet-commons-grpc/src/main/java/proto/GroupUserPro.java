// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: GroupUserService.proto

package proto;

/**
 * Protobuf type {@code com.skynet.commons.grpc.dipper.proto.GroupUserPro}
 */
public  final class GroupUserPro extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:com.skynet.commons.grpc.dipper.proto.GroupUserPro)
        GroupUserProOrBuilder {
private static final long serialVersionUID = 0L;
  // Use GroupUserPro.newBuilder() to construct.
  private GroupUserPro(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private GroupUserPro() {
    joinTime_ = "";
  }

  @Override
  @SuppressWarnings({"unused"})
  protected Object newInstance(
      UnusedPrivateParameter unused) {
    return new GroupUserPro();
  }

  @Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private GroupUserPro(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new NullPointerException();
    }
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 8: {

            id_ = input.readInt32();
            break;
          }
          case 16: {

            userId_ = input.readInt32();
            break;
          }
          case 24: {

            groupId_ = input.readInt32();
            break;
          }
          case 34: {
            String s = input.readStringRequireUtf8();

            joinTime_ = s;
            break;
          }
          default: {
            if (!parseUnknownField(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return GroupUserProto.internal_static_com_skynet_commons_grpc_dipper_proto_GroupUserPro_descriptor;
  }

  @Override
  protected FieldAccessorTable
      internalGetFieldAccessorTable() {
    return GroupUserProto.internal_static_com_skynet_commons_grpc_dipper_proto_GroupUserPro_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            GroupUserPro.class, GroupUserPro.Builder.class);
  }

  public static final int ID_FIELD_NUMBER = 1;
  private int id_;
  /**
   * <code>int32 id = 1;</code>
   * @return The id.
   */
  public int getId() {
    return id_;
  }

  public static final int USER_ID_FIELD_NUMBER = 2;
  private int userId_;
  /**
   * <code>int32 user_id = 2;</code>
   * @return The userId.
   */
  public int getUserId() {
    return userId_;
  }

  public static final int GROUP_ID_FIELD_NUMBER = 3;
  private int groupId_;
  /**
   * <code>int32 group_id = 3;</code>
   * @return The groupId.
   */
  public int getGroupId() {
    return groupId_;
  }

  public static final int JOIN_TIME_FIELD_NUMBER = 4;
  private volatile Object joinTime_;
  /**
   * <code>string join_time = 4;</code>
   * @return The joinTime.
   */
  public String getJoinTime() {
    Object ref = joinTime_;
    if (ref instanceof String) {
      return (String) ref;
    } else {
      com.google.protobuf.ByteString bs =
          (com.google.protobuf.ByteString) ref;
      String s = bs.toStringUtf8();
      joinTime_ = s;
      return s;
    }
  }
  /**
   * <code>string join_time = 4;</code>
   * @return The bytes for joinTime.
   */
  public com.google.protobuf.ByteString
      getJoinTimeBytes() {
    Object ref = joinTime_;
    if (ref instanceof String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8(
              (String) ref);
      joinTime_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  private byte memoizedIsInitialized = -1;
  @Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (id_ != 0) {
      output.writeInt32(1, id_);
    }
    if (userId_ != 0) {
      output.writeInt32(2, userId_);
    }
    if (groupId_ != 0) {
      output.writeInt32(3, groupId_);
    }
    if (!getJoinTimeBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 4, joinTime_);
    }
    unknownFields.writeTo(output);
  }

  @Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (id_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(1, id_);
    }
    if (userId_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(2, userId_);
    }
    if (groupId_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(3, groupId_);
    }
    if (!getJoinTimeBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, joinTime_);
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @Override
  public boolean equals(final Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof GroupUserPro)) {
      return super.equals(obj);
    }
    GroupUserPro other = (GroupUserPro) obj;

    if (getId()
        != other.getId()) return false;
    if (getUserId()
        != other.getUserId()) return false;
    if (getGroupId()
        != other.getGroupId()) return false;
    if (!getJoinTime()
        .equals(other.getJoinTime())) return false;
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + ID_FIELD_NUMBER;
    hash = (53 * hash) + getId();
    hash = (37 * hash) + USER_ID_FIELD_NUMBER;
    hash = (53 * hash) + getUserId();
    hash = (37 * hash) + GROUP_ID_FIELD_NUMBER;
    hash = (53 * hash) + getGroupId();
    hash = (37 * hash) + JOIN_TIME_FIELD_NUMBER;
    hash = (53 * hash) + getJoinTime().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static GroupUserPro parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static GroupUserPro parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static GroupUserPro parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static GroupUserPro parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static GroupUserPro parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static GroupUserPro parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static GroupUserPro parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static GroupUserPro parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static GroupUserPro parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static GroupUserPro parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static GroupUserPro parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static GroupUserPro parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(GroupUserPro prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @Override
  protected Builder newBuilderForType(
      BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code com.skynet.commons.grpc.dipper.proto.GroupUserPro}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:com.skynet.commons.grpc.dipper.proto.GroupUserPro)
          GroupUserProOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return GroupUserProto.internal_static_com_skynet_commons_grpc_dipper_proto_GroupUserPro_descriptor;
    }

    @Override
    protected FieldAccessorTable
        internalGetFieldAccessorTable() {
      return GroupUserProto.internal_static_com_skynet_commons_grpc_dipper_proto_GroupUserPro_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              GroupUserPro.class, GroupUserPro.Builder.class);
    }

    // Construct using com.skynet.commons.grpc.dipper.proto.GroupUserPro.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    @Override
    public Builder clear() {
      super.clear();
      id_ = 0;

      userId_ = 0;

      groupId_ = 0;

      joinTime_ = "";

      return this;
    }

    @Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return GroupUserProto.internal_static_com_skynet_commons_grpc_dipper_proto_GroupUserPro_descriptor;
    }

    @Override
    public GroupUserPro getDefaultInstanceForType() {
      return GroupUserPro.getDefaultInstance();
    }

    @Override
    public GroupUserPro build() {
      GroupUserPro result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @Override
    public GroupUserPro buildPartial() {
      GroupUserPro result = new GroupUserPro(this);
      result.id_ = id_;
      result.userId_ = userId_;
      result.groupId_ = groupId_;
      result.joinTime_ = joinTime_;
      onBuilt();
      return result;
    }

    @Override
    public Builder clone() {
      return super.clone();
    }
    @Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        Object value) {
      return super.setField(field, value);
    }
    @Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        Object value) {
      return super.addRepeatedField(field, value);
    }
    @Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof GroupUserPro) {
        return mergeFrom((GroupUserPro)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(GroupUserPro other) {
      if (other == GroupUserPro.getDefaultInstance()) return this;
      if (other.getId() != 0) {
        setId(other.getId());
      }
      if (other.getUserId() != 0) {
        setUserId(other.getUserId());
      }
      if (other.getGroupId() != 0) {
        setGroupId(other.getGroupId());
      }
      if (!other.getJoinTime().isEmpty()) {
        joinTime_ = other.joinTime_;
        onChanged();
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @Override
    public final boolean isInitialized() {
      return true;
    }

    @Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      GroupUserPro parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (GroupUserPro) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int id_ ;
    /**
     * <code>int32 id = 1;</code>
     * @return The id.
     */
    public int getId() {
      return id_;
    }
    /**
     * <code>int32 id = 1;</code>
     * @param value The id to set.
     * @return This builder for chaining.
     */
    public Builder setId(int value) {

      id_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 id = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearId() {

      id_ = 0;
      onChanged();
      return this;
    }

    private int userId_ ;
    /**
     * <code>int32 user_id = 2;</code>
     * @return The userId.
     */
    public int getUserId() {
      return userId_;
    }
    /**
     * <code>int32 user_id = 2;</code>
     * @param value The userId to set.
     * @return This builder for chaining.
     */
    public Builder setUserId(int value) {

      userId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 user_id = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearUserId() {

      userId_ = 0;
      onChanged();
      return this;
    }

    private int groupId_ ;
    /**
     * <code>int32 group_id = 3;</code>
     * @return The groupId.
     */
    public int getGroupId() {
      return groupId_;
    }
    /**
     * <code>int32 group_id = 3;</code>
     * @param value The groupId to set.
     * @return This builder for chaining.
     */
    public Builder setGroupId(int value) {

      groupId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 group_id = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearGroupId() {

      groupId_ = 0;
      onChanged();
      return this;
    }

    private Object joinTime_ = "";
    /**
     * <code>string join_time = 4;</code>
     * @return The joinTime.
     */
    public String getJoinTime() {
      Object ref = joinTime_;
      if (!(ref instanceof String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        joinTime_ = s;
        return s;
      } else {
        return (String) ref;
      }
    }
    /**
     * <code>string join_time = 4;</code>
     * @return The bytes for joinTime.
     */
    public com.google.protobuf.ByteString
        getJoinTimeBytes() {
      Object ref = joinTime_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8(
                (String) ref);
        joinTime_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string join_time = 4;</code>
     * @param value The joinTime to set.
     * @return This builder for chaining.
     */
    public Builder setJoinTime(
        String value) {
      if (value == null) {
    throw new NullPointerException();
  }

      joinTime_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string join_time = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearJoinTime() {

      joinTime_ = getDefaultInstance().getJoinTime();
      onChanged();
      return this;
    }
    /**
     * <code>string join_time = 4;</code>
     * @param value The bytes for joinTime to set.
     * @return This builder for chaining.
     */
    public Builder setJoinTimeBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);

      joinTime_ = value;
      onChanged();
      return this;
    }
    @Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:com.skynet.commons.grpc.dipper.proto.GroupUserPro)
  }

  // @@protoc_insertion_point(class_scope:com.skynet.commons.grpc.dipper.proto.GroupUserPro)
  private static final GroupUserPro DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new GroupUserPro();
  }

  public static GroupUserPro getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GroupUserPro>
      PARSER = new com.google.protobuf.AbstractParser<GroupUserPro>() {
    @Override
    public GroupUserPro parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new GroupUserPro(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<GroupUserPro> parser() {
    return PARSER;
  }

  @Override
  public com.google.protobuf.Parser<GroupUserPro> getParserForType() {
    return PARSER;
  }

  @Override
  public GroupUserPro getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

