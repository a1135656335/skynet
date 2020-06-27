// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: BlogMessageService.proto

package com.skynet.dipper.commons.grpc.blog;

/**
 * Protobuf type {@code com.skynet.dipper.commons.grpc.blog.BlogMessagePro}
 */
public  final class BlogMessagePro extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:com.skynet.dipper.commons.grpc.blog.BlogMessagePro)
    BlogMessageProOrBuilder {
private static final long serialVersionUID = 0L;
  // Use BlogMessagePro.newBuilder() to construct.
  private BlogMessagePro(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private BlogMessagePro() {
    content_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new BlogMessagePro();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private BlogMessagePro(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
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

            blogId_ = input.readInt32();
            break;
          }
          case 24: {

            userId_ = input.readInt32();
            break;
          }
          case 32: {

            msgType_ = input.readInt32();
            break;
          }
          case 42: {
            java.lang.String s = input.readStringRequireUtf8();

            content_ = s;
            break;
          }
          case 48: {

            buildTime_ = input.readInt32();
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
    return com.skynet.dipper.commons.grpc.blog.BlogMessageProto.internal_static_com_skynet_dipper_commons_grpc_blog_BlogMessagePro_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.skynet.dipper.commons.grpc.blog.BlogMessageProto.internal_static_com_skynet_dipper_commons_grpc_blog_BlogMessagePro_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.skynet.dipper.commons.grpc.blog.BlogMessagePro.class, com.skynet.dipper.commons.grpc.blog.BlogMessagePro.Builder.class);
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

  public static final int BLOG_ID_FIELD_NUMBER = 2;
  private int blogId_;
  /**
   * <code>int32 blog_id = 2;</code>
   * @return The blogId.
   */
  public int getBlogId() {
    return blogId_;
  }

  public static final int USER_ID_FIELD_NUMBER = 3;
  private int userId_;
  /**
   * <code>int32 user_id = 3;</code>
   * @return The userId.
   */
  public int getUserId() {
    return userId_;
  }

  public static final int MSG_TYPE_FIELD_NUMBER = 4;
  private int msgType_;
  /**
   * <code>int32 msg_type = 4;</code>
   * @return The msgType.
   */
  public int getMsgType() {
    return msgType_;
  }

  public static final int CONTENT_FIELD_NUMBER = 5;
  private volatile java.lang.Object content_;
  /**
   * <code>string content = 5;</code>
   * @return The content.
   */
  public java.lang.String getContent() {
    java.lang.Object ref = content_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      content_ = s;
      return s;
    }
  }
  /**
   * <code>string content = 5;</code>
   * @return The bytes for content.
   */
  public com.google.protobuf.ByteString
      getContentBytes() {
    java.lang.Object ref = content_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      content_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int BUILD_TIME_FIELD_NUMBER = 6;
  private int buildTime_;
  /**
   * <code>int32 build_time = 6;</code>
   * @return The buildTime.
   */
  public int getBuildTime() {
    return buildTime_;
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (id_ != 0) {
      output.writeInt32(1, id_);
    }
    if (blogId_ != 0) {
      output.writeInt32(2, blogId_);
    }
    if (userId_ != 0) {
      output.writeInt32(3, userId_);
    }
    if (msgType_ != 0) {
      output.writeInt32(4, msgType_);
    }
    if (!getContentBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 5, content_);
    }
    if (buildTime_ != 0) {
      output.writeInt32(6, buildTime_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (id_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(1, id_);
    }
    if (blogId_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(2, blogId_);
    }
    if (userId_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(3, userId_);
    }
    if (msgType_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(4, msgType_);
    }
    if (!getContentBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(5, content_);
    }
    if (buildTime_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(6, buildTime_);
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.skynet.dipper.commons.grpc.blog.BlogMessagePro)) {
      return super.equals(obj);
    }
    com.skynet.dipper.commons.grpc.blog.BlogMessagePro other = (com.skynet.dipper.commons.grpc.blog.BlogMessagePro) obj;

    if (getId()
        != other.getId()) return false;
    if (getBlogId()
        != other.getBlogId()) return false;
    if (getUserId()
        != other.getUserId()) return false;
    if (getMsgType()
        != other.getMsgType()) return false;
    if (!getContent()
        .equals(other.getContent())) return false;
    if (getBuildTime()
        != other.getBuildTime()) return false;
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + ID_FIELD_NUMBER;
    hash = (53 * hash) + getId();
    hash = (37 * hash) + BLOG_ID_FIELD_NUMBER;
    hash = (53 * hash) + getBlogId();
    hash = (37 * hash) + USER_ID_FIELD_NUMBER;
    hash = (53 * hash) + getUserId();
    hash = (37 * hash) + MSG_TYPE_FIELD_NUMBER;
    hash = (53 * hash) + getMsgType();
    hash = (37 * hash) + CONTENT_FIELD_NUMBER;
    hash = (53 * hash) + getContent().hashCode();
    hash = (37 * hash) + BUILD_TIME_FIELD_NUMBER;
    hash = (53 * hash) + getBuildTime();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.skynet.dipper.commons.grpc.blog.BlogMessagePro parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.skynet.dipper.commons.grpc.blog.BlogMessagePro parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.skynet.dipper.commons.grpc.blog.BlogMessagePro parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.skynet.dipper.commons.grpc.blog.BlogMessagePro parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.skynet.dipper.commons.grpc.blog.BlogMessagePro parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.skynet.dipper.commons.grpc.blog.BlogMessagePro parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.skynet.dipper.commons.grpc.blog.BlogMessagePro parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.skynet.dipper.commons.grpc.blog.BlogMessagePro parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.skynet.dipper.commons.grpc.blog.BlogMessagePro parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.skynet.dipper.commons.grpc.blog.BlogMessagePro parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.skynet.dipper.commons.grpc.blog.BlogMessagePro parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.skynet.dipper.commons.grpc.blog.BlogMessagePro parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.skynet.dipper.commons.grpc.blog.BlogMessagePro prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code com.skynet.dipper.commons.grpc.blog.BlogMessagePro}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:com.skynet.dipper.commons.grpc.blog.BlogMessagePro)
      com.skynet.dipper.commons.grpc.blog.BlogMessageProOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.skynet.dipper.commons.grpc.blog.BlogMessageProto.internal_static_com_skynet_dipper_commons_grpc_blog_BlogMessagePro_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.skynet.dipper.commons.grpc.blog.BlogMessageProto.internal_static_com_skynet_dipper_commons_grpc_blog_BlogMessagePro_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.skynet.dipper.commons.grpc.blog.BlogMessagePro.class, com.skynet.dipper.commons.grpc.blog.BlogMessagePro.Builder.class);
    }

    // Construct using com.skynet.dipper.commons.grpc.blog.BlogMessagePro.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      id_ = 0;

      blogId_ = 0;

      userId_ = 0;

      msgType_ = 0;

      content_ = "";

      buildTime_ = 0;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.skynet.dipper.commons.grpc.blog.BlogMessageProto.internal_static_com_skynet_dipper_commons_grpc_blog_BlogMessagePro_descriptor;
    }

    @java.lang.Override
    public com.skynet.dipper.commons.grpc.blog.BlogMessagePro getDefaultInstanceForType() {
      return com.skynet.dipper.commons.grpc.blog.BlogMessagePro.getDefaultInstance();
    }

    @java.lang.Override
    public com.skynet.dipper.commons.grpc.blog.BlogMessagePro build() {
      com.skynet.dipper.commons.grpc.blog.BlogMessagePro result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.skynet.dipper.commons.grpc.blog.BlogMessagePro buildPartial() {
      com.skynet.dipper.commons.grpc.blog.BlogMessagePro result = new com.skynet.dipper.commons.grpc.blog.BlogMessagePro(this);
      result.id_ = id_;
      result.blogId_ = blogId_;
      result.userId_ = userId_;
      result.msgType_ = msgType_;
      result.content_ = content_;
      result.buildTime_ = buildTime_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.skynet.dipper.commons.grpc.blog.BlogMessagePro) {
        return mergeFrom((com.skynet.dipper.commons.grpc.blog.BlogMessagePro)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.skynet.dipper.commons.grpc.blog.BlogMessagePro other) {
      if (other == com.skynet.dipper.commons.grpc.blog.BlogMessagePro.getDefaultInstance()) return this;
      if (other.getId() != 0) {
        setId(other.getId());
      }
      if (other.getBlogId() != 0) {
        setBlogId(other.getBlogId());
      }
      if (other.getUserId() != 0) {
        setUserId(other.getUserId());
      }
      if (other.getMsgType() != 0) {
        setMsgType(other.getMsgType());
      }
      if (!other.getContent().isEmpty()) {
        content_ = other.content_;
        onChanged();
      }
      if (other.getBuildTime() != 0) {
        setBuildTime(other.getBuildTime());
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      com.skynet.dipper.commons.grpc.blog.BlogMessagePro parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.skynet.dipper.commons.grpc.blog.BlogMessagePro) e.getUnfinishedMessage();
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

    private int blogId_ ;
    /**
     * <code>int32 blog_id = 2;</code>
     * @return The blogId.
     */
    public int getBlogId() {
      return blogId_;
    }
    /**
     * <code>int32 blog_id = 2;</code>
     * @param value The blogId to set.
     * @return This builder for chaining.
     */
    public Builder setBlogId(int value) {
      
      blogId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 blog_id = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearBlogId() {
      
      blogId_ = 0;
      onChanged();
      return this;
    }

    private int userId_ ;
    /**
     * <code>int32 user_id = 3;</code>
     * @return The userId.
     */
    public int getUserId() {
      return userId_;
    }
    /**
     * <code>int32 user_id = 3;</code>
     * @param value The userId to set.
     * @return This builder for chaining.
     */
    public Builder setUserId(int value) {
      
      userId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 user_id = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearUserId() {
      
      userId_ = 0;
      onChanged();
      return this;
    }

    private int msgType_ ;
    /**
     * <code>int32 msg_type = 4;</code>
     * @return The msgType.
     */
    public int getMsgType() {
      return msgType_;
    }
    /**
     * <code>int32 msg_type = 4;</code>
     * @param value The msgType to set.
     * @return This builder for chaining.
     */
    public Builder setMsgType(int value) {
      
      msgType_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 msg_type = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearMsgType() {
      
      msgType_ = 0;
      onChanged();
      return this;
    }

    private java.lang.Object content_ = "";
    /**
     * <code>string content = 5;</code>
     * @return The content.
     */
    public java.lang.String getContent() {
      java.lang.Object ref = content_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        content_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string content = 5;</code>
     * @return The bytes for content.
     */
    public com.google.protobuf.ByteString
        getContentBytes() {
      java.lang.Object ref = content_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        content_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string content = 5;</code>
     * @param value The content to set.
     * @return This builder for chaining.
     */
    public Builder setContent(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      content_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string content = 5;</code>
     * @return This builder for chaining.
     */
    public Builder clearContent() {
      
      content_ = getDefaultInstance().getContent();
      onChanged();
      return this;
    }
    /**
     * <code>string content = 5;</code>
     * @param value The bytes for content to set.
     * @return This builder for chaining.
     */
    public Builder setContentBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      content_ = value;
      onChanged();
      return this;
    }

    private int buildTime_ ;
    /**
     * <code>int32 build_time = 6;</code>
     * @return The buildTime.
     */
    public int getBuildTime() {
      return buildTime_;
    }
    /**
     * <code>int32 build_time = 6;</code>
     * @param value The buildTime to set.
     * @return This builder for chaining.
     */
    public Builder setBuildTime(int value) {
      
      buildTime_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 build_time = 6;</code>
     * @return This builder for chaining.
     */
    public Builder clearBuildTime() {
      
      buildTime_ = 0;
      onChanged();
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:com.skynet.dipper.commons.grpc.blog.BlogMessagePro)
  }

  // @@protoc_insertion_point(class_scope:com.skynet.dipper.commons.grpc.blog.BlogMessagePro)
  private static final com.skynet.dipper.commons.grpc.blog.BlogMessagePro DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.skynet.dipper.commons.grpc.blog.BlogMessagePro();
  }

  public static com.skynet.dipper.commons.grpc.blog.BlogMessagePro getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<BlogMessagePro>
      PARSER = new com.google.protobuf.AbstractParser<BlogMessagePro>() {
    @java.lang.Override
    public BlogMessagePro parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new BlogMessagePro(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<BlogMessagePro> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<BlogMessagePro> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.skynet.dipper.commons.grpc.blog.BlogMessagePro getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

