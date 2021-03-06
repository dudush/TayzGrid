// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: LockResponse.proto

package com.alachisoft.tayzgrid.common.protobuf;

public final class LockResponseProtocol {
  private LockResponseProtocol() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  public static final class LockResponse extends
      com.google.protobuf.GeneratedMessage {
    // Use LockResponse.newBuilder() to construct.
    private LockResponse() {
      initFields();
    }
    private LockResponse(boolean noInit) {}
    
    private static final LockResponse defaultInstance;
    public static LockResponse getDefaultInstance() {
      return defaultInstance;
    }
    
    public LockResponse getDefaultInstanceForType() {
      return defaultInstance;
    }
    
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.alachisoft.tayzgrid.common.protobuf.LockResponseProtocol.internal_static_com_alachisoft_tayzgrid_common_protobuf_LockResponse_descriptor;
    }
    
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.alachisoft.tayzgrid.common.protobuf.LockResponseProtocol.internal_static_com_alachisoft_tayzgrid_common_protobuf_LockResponse_fieldAccessorTable;
    }
    
    // optional bool locked = 1;
    public static final int LOCKED_FIELD_NUMBER = 1;
    private boolean hasLocked;
    private boolean locked_ = false;
    public boolean hasLocked() { return hasLocked; }
    public boolean getLocked() { return locked_; }
    
    // optional string lockId = 2;
    public static final int LOCKID_FIELD_NUMBER = 2;
    private boolean hasLockId;
    private java.lang.String lockId_ = "";
    public boolean hasLockId() { return hasLockId; }
    public java.lang.String getLockId() { return lockId_; }
    
    // optional int64 lockTime = 3;
    public static final int LOCKTIME_FIELD_NUMBER = 3;
    private boolean hasLockTime;
    private long lockTime_ = 0L;
    public boolean hasLockTime() { return hasLockTime; }
    public long getLockTime() { return lockTime_; }
    
    private void initFields() {
    }
    public final boolean isInitialized() {
      return true;
    }
    
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      getSerializedSize();
      if (hasLocked()) {
        output.writeBool(1, getLocked());
      }
      if (hasLockId()) {
        output.writeString(2, getLockId());
      }
      if (hasLockTime()) {
        output.writeInt64(3, getLockTime());
      }
      getUnknownFields().writeTo(output);
    }
    
    private int memoizedSerializedSize = -1;
    public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != -1) return size;
    
      size = 0;
      if (hasLocked()) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(1, getLocked());
      }
      if (hasLockId()) {
        size += com.google.protobuf.CodedOutputStream
          .computeStringSize(2, getLockId());
      }
      if (hasLockTime()) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt64Size(3, getLockTime());
      }
      size += getUnknownFields().getSerializedSize();
      memoizedSerializedSize = size;
      return size;
    }
    
    public static com.alachisoft.tayzgrid.common.protobuf.LockResponseProtocol.LockResponse parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static com.alachisoft.tayzgrid.common.protobuf.LockResponseProtocol.LockResponse parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static com.alachisoft.tayzgrid.common.protobuf.LockResponseProtocol.LockResponse parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static com.alachisoft.tayzgrid.common.protobuf.LockResponseProtocol.LockResponse parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static com.alachisoft.tayzgrid.common.protobuf.LockResponseProtocol.LockResponse parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static com.alachisoft.tayzgrid.common.protobuf.LockResponseProtocol.LockResponse parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    public static com.alachisoft.tayzgrid.common.protobuf.LockResponseProtocol.LockResponse parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      Builder builder = newBuilder();
      if (builder.mergeDelimitedFrom(input)) {
        return builder.buildParsed();
      } else {
        return null;
      }
    }
    public static com.alachisoft.tayzgrid.common.protobuf.LockResponseProtocol.LockResponse parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      Builder builder = newBuilder();
      if (builder.mergeDelimitedFrom(input, extensionRegistry)) {
        return builder.buildParsed();
      } else {
        return null;
      }
    }
    public static com.alachisoft.tayzgrid.common.protobuf.LockResponseProtocol.LockResponse parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static com.alachisoft.tayzgrid.common.protobuf.LockResponseProtocol.LockResponse parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    
    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(com.alachisoft.tayzgrid.common.protobuf.LockResponseProtocol.LockResponse prototype) {
      return newBuilder().mergeFrom(prototype);
    }
    public Builder toBuilder() { return newBuilder(this); }
    
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder> {
      private com.alachisoft.tayzgrid.common.protobuf.LockResponseProtocol.LockResponse result;
      
      // Construct using com.alachisoft.tayzgrid.common.protobuf.LockResponseProtocol.LockResponse.newBuilder()
      private Builder() {}
      
      private static Builder create() {
        Builder builder = new Builder();
        builder.result = new com.alachisoft.tayzgrid.common.protobuf.LockResponseProtocol.LockResponse();
        return builder;
      }
      
      protected com.alachisoft.tayzgrid.common.protobuf.LockResponseProtocol.LockResponse internalGetResult() {
        return result;
      }
      
      public Builder clear() {
        if (result == null) {
          throw new IllegalStateException(
            "Cannot call clear() after build().");
        }
        result = new com.alachisoft.tayzgrid.common.protobuf.LockResponseProtocol.LockResponse();
        return this;
      }
      
      public Builder clone() {
        return create().mergeFrom(result);
      }
      
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.alachisoft.tayzgrid.common.protobuf.LockResponseProtocol.LockResponse.getDescriptor();
      }
      
      public com.alachisoft.tayzgrid.common.protobuf.LockResponseProtocol.LockResponse getDefaultInstanceForType() {
        return com.alachisoft.tayzgrid.common.protobuf.LockResponseProtocol.LockResponse.getDefaultInstance();
      }
      
      public boolean isInitialized() {
        return result.isInitialized();
      }
      public com.alachisoft.tayzgrid.common.protobuf.LockResponseProtocol.LockResponse build() {
        if (result != null && !isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return buildPartial();
      }
      
      private com.alachisoft.tayzgrid.common.protobuf.LockResponseProtocol.LockResponse buildParsed()
          throws com.google.protobuf.InvalidProtocolBufferException {
        if (!isInitialized()) {
          throw newUninitializedMessageException(
            result).asInvalidProtocolBufferException();
        }
        return buildPartial();
      }
      
      public com.alachisoft.tayzgrid.common.protobuf.LockResponseProtocol.LockResponse buildPartial() {
        if (result == null) {
          throw new IllegalStateException(
            "build() has already been called on this Builder.");
        }
        com.alachisoft.tayzgrid.common.protobuf.LockResponseProtocol.LockResponse returnMe = result;
        result = null;
        return returnMe;
      }
      
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof com.alachisoft.tayzgrid.common.protobuf.LockResponseProtocol.LockResponse) {
          return mergeFrom((com.alachisoft.tayzgrid.common.protobuf.LockResponseProtocol.LockResponse)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }
      
      public Builder mergeFrom(com.alachisoft.tayzgrid.common.protobuf.LockResponseProtocol.LockResponse other) {
        if (other == com.alachisoft.tayzgrid.common.protobuf.LockResponseProtocol.LockResponse.getDefaultInstance()) return this;
        if (other.hasLocked()) {
          setLocked(other.getLocked());
        }
        if (other.hasLockId()) {
          setLockId(other.getLockId());
        }
        if (other.hasLockTime()) {
          setLockTime(other.getLockTime());
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }
      
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder(
            this.getUnknownFields());
        while (true) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              this.setUnknownFields(unknownFields.build());
              return this;
            default: {
              if (!parseUnknownField(input, unknownFields,
                                     extensionRegistry, tag)) {
                this.setUnknownFields(unknownFields.build());
                return this;
              }
              break;
            }
            case 8: {
              setLocked(input.readBool());
              break;
            }
            case 18: {
              setLockId(input.readString());
              break;
            }
            case 24: {
              setLockTime(input.readInt64());
              break;
            }
          }
        }
      }
      
      
      // optional bool locked = 1;
      public boolean hasLocked() {
        return result.hasLocked();
      }
      public boolean getLocked() {
        return result.getLocked();
      }
      public Builder setLocked(boolean value) {
        result.hasLocked = true;
        result.locked_ = value;
        return this;
      }
      public Builder clearLocked() {
        result.hasLocked = false;
        result.locked_ = false;
        return this;
      }
      
      // optional string lockId = 2;
      public boolean hasLockId() {
        return result.hasLockId();
      }
      public java.lang.String getLockId() {
        return result.getLockId();
      }
      public Builder setLockId(java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  result.hasLockId = true;
        result.lockId_ = value;
        return this;
      }
      public Builder clearLockId() {
        result.hasLockId = false;
        result.lockId_ = getDefaultInstance().getLockId();
        return this;
      }
      
      // optional int64 lockTime = 3;
      public boolean hasLockTime() {
        return result.hasLockTime();
      }
      public long getLockTime() {
        return result.getLockTime();
      }
      public Builder setLockTime(long value) {
        result.hasLockTime = true;
        result.lockTime_ = value;
        return this;
      }
      public Builder clearLockTime() {
        result.hasLockTime = false;
        result.lockTime_ = 0L;
        return this;
      }
      
      // @@protoc_insertion_point(builder_scope:com.alachisoft.tayzgrid.common.protobuf.LockResponse)
    }
    
    static {
      defaultInstance = new LockResponse(true);
      com.alachisoft.tayzgrid.common.protobuf.LockResponseProtocol.internalForceInit();
      defaultInstance.initFields();
    }
    
    // @@protoc_insertion_point(class_scope:com.alachisoft.tayzgrid.common.protobuf.LockResponse)
  }
  
  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_com_alachisoft_tayzgrid_common_protobuf_LockResponse_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_com_alachisoft_tayzgrid_common_protobuf_LockResponse_fieldAccessorTable;
  
  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\022LockResponse.proto\022\'com.alachisoft.tay" +
      "zgrid.common.protobuf\"@\n\014LockResponse\022\016\n" +
      "\006locked\030\001 \001(\010\022\016\n\006lockId\030\002 \001(\t\022\020\n\010lockTim" +
      "e\030\003 \001(\003B\026B\024LockResponseProtocol"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
      new com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner() {
        public com.google.protobuf.ExtensionRegistry assignDescriptors(
            com.google.protobuf.Descriptors.FileDescriptor root) {
          descriptor = root;
          internal_static_com_alachisoft_tayzgrid_common_protobuf_LockResponse_descriptor =
            getDescriptor().getMessageTypes().get(0);
          internal_static_com_alachisoft_tayzgrid_common_protobuf_LockResponse_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_com_alachisoft_tayzgrid_common_protobuf_LockResponse_descriptor,
              new java.lang.String[] { "Locked", "LockId", "LockTime", },
              com.alachisoft.tayzgrid.common.protobuf.LockResponseProtocol.LockResponse.class,
              com.alachisoft.tayzgrid.common.protobuf.LockResponseProtocol.LockResponse.Builder.class);
          return null;
        }
      };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
  }
  
  public static void internalForceInit() {}
  
  // @@protoc_insertion_point(outer_class_scope)
}
