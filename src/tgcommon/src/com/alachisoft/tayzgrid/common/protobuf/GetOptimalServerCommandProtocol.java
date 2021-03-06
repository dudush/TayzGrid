// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: GetOptimalServerCommand.proto

package com.alachisoft.tayzgrid.common.protobuf;

public final class GetOptimalServerCommandProtocol {
  private GetOptimalServerCommandProtocol() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  public static final class GetOptimalServerCommand extends
      com.google.protobuf.GeneratedMessage {
    // Use GetOptimalServerCommand.newBuilder() to construct.
    private GetOptimalServerCommand() {
      initFields();
    }
    private GetOptimalServerCommand(boolean noInit) {}
    
    private static final GetOptimalServerCommand defaultInstance;
    public static GetOptimalServerCommand getDefaultInstance() {
      return defaultInstance;
    }
    
    public GetOptimalServerCommand getDefaultInstanceForType() {
      return defaultInstance;
    }
    
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.alachisoft.tayzgrid.common.protobuf.GetOptimalServerCommandProtocol.internal_static_com_alachisoft_tayzgrid_common_protobuf_GetOptimalServerCommand_descriptor;
    }
    
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.alachisoft.tayzgrid.common.protobuf.GetOptimalServerCommandProtocol.internal_static_com_alachisoft_tayzgrid_common_protobuf_GetOptimalServerCommand_fieldAccessorTable;
    }
    
    // optional int64 requestId = 1;
    public static final int REQUESTID_FIELD_NUMBER = 1;
    private boolean hasRequestId;
    private long requestId_ = 0L;
    public boolean hasRequestId() { return hasRequestId; }
    public long getRequestId() { return requestId_; }
    
    // optional string cacheId = 2;
    public static final int CACHEID_FIELD_NUMBER = 2;
    private boolean hasCacheId;
    private java.lang.String cacheId_ = "";
    public boolean hasCacheId() { return hasCacheId; }
    public java.lang.String getCacheId() { return cacheId_; }
    
    // optional bool isDotnetClient = 3 [default = true];
    public static final int ISDOTNETCLIENT_FIELD_NUMBER = 3;
    private boolean hasIsDotnetClient;
    private boolean isDotnetClient_ = true;
    public boolean hasIsDotnetClient() { return hasIsDotnetClient; }
    public boolean getIsDotnetClient() { return isDotnetClient_; }
    
    private void initFields() {
    }
    public final boolean isInitialized() {
      return true;
    }
    
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      getSerializedSize();
      if (hasRequestId()) {
        output.writeInt64(1, getRequestId());
      }
      if (hasCacheId()) {
        output.writeString(2, getCacheId());
      }
      if (hasIsDotnetClient()) {
        output.writeBool(3, getIsDotnetClient());
      }
      getUnknownFields().writeTo(output);
    }
    
    private int memoizedSerializedSize = -1;
    public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != -1) return size;
    
      size = 0;
      if (hasRequestId()) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt64Size(1, getRequestId());
      }
      if (hasCacheId()) {
        size += com.google.protobuf.CodedOutputStream
          .computeStringSize(2, getCacheId());
      }
      if (hasIsDotnetClient()) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(3, getIsDotnetClient());
      }
      size += getUnknownFields().getSerializedSize();
      memoizedSerializedSize = size;
      return size;
    }
    
    public static com.alachisoft.tayzgrid.common.protobuf.GetOptimalServerCommandProtocol.GetOptimalServerCommand parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static com.alachisoft.tayzgrid.common.protobuf.GetOptimalServerCommandProtocol.GetOptimalServerCommand parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static com.alachisoft.tayzgrid.common.protobuf.GetOptimalServerCommandProtocol.GetOptimalServerCommand parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static com.alachisoft.tayzgrid.common.protobuf.GetOptimalServerCommandProtocol.GetOptimalServerCommand parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static com.alachisoft.tayzgrid.common.protobuf.GetOptimalServerCommandProtocol.GetOptimalServerCommand parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static com.alachisoft.tayzgrid.common.protobuf.GetOptimalServerCommandProtocol.GetOptimalServerCommand parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    public static com.alachisoft.tayzgrid.common.protobuf.GetOptimalServerCommandProtocol.GetOptimalServerCommand parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      Builder builder = newBuilder();
      if (builder.mergeDelimitedFrom(input)) {
        return builder.buildParsed();
      } else {
        return null;
      }
    }
    public static com.alachisoft.tayzgrid.common.protobuf.GetOptimalServerCommandProtocol.GetOptimalServerCommand parseDelimitedFrom(
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
    public static com.alachisoft.tayzgrid.common.protobuf.GetOptimalServerCommandProtocol.GetOptimalServerCommand parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static com.alachisoft.tayzgrid.common.protobuf.GetOptimalServerCommandProtocol.GetOptimalServerCommand parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    
    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(com.alachisoft.tayzgrid.common.protobuf.GetOptimalServerCommandProtocol.GetOptimalServerCommand prototype) {
      return newBuilder().mergeFrom(prototype);
    }
    public Builder toBuilder() { return newBuilder(this); }
    
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder> {
      private com.alachisoft.tayzgrid.common.protobuf.GetOptimalServerCommandProtocol.GetOptimalServerCommand result;
      
      // Construct using com.alachisoft.tayzgrid.common.protobuf.GetOptimalServerCommandProtocol.GetOptimalServerCommand.newBuilder()
      private Builder() {}
      
      private static Builder create() {
        Builder builder = new Builder();
        builder.result = new com.alachisoft.tayzgrid.common.protobuf.GetOptimalServerCommandProtocol.GetOptimalServerCommand();
        return builder;
      }
      
      protected com.alachisoft.tayzgrid.common.protobuf.GetOptimalServerCommandProtocol.GetOptimalServerCommand internalGetResult() {
        return result;
      }
      
      public Builder clear() {
        if (result == null) {
          throw new IllegalStateException(
            "Cannot call clear() after build().");
        }
        result = new com.alachisoft.tayzgrid.common.protobuf.GetOptimalServerCommandProtocol.GetOptimalServerCommand();
        return this;
      }
      
      public Builder clone() {
        return create().mergeFrom(result);
      }
      
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.alachisoft.tayzgrid.common.protobuf.GetOptimalServerCommandProtocol.GetOptimalServerCommand.getDescriptor();
      }
      
      public com.alachisoft.tayzgrid.common.protobuf.GetOptimalServerCommandProtocol.GetOptimalServerCommand getDefaultInstanceForType() {
        return com.alachisoft.tayzgrid.common.protobuf.GetOptimalServerCommandProtocol.GetOptimalServerCommand.getDefaultInstance();
      }
      
      public boolean isInitialized() {
        return result.isInitialized();
      }
      public com.alachisoft.tayzgrid.common.protobuf.GetOptimalServerCommandProtocol.GetOptimalServerCommand build() {
        if (result != null && !isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return buildPartial();
      }
      
      private com.alachisoft.tayzgrid.common.protobuf.GetOptimalServerCommandProtocol.GetOptimalServerCommand buildParsed()
          throws com.google.protobuf.InvalidProtocolBufferException {
        if (!isInitialized()) {
          throw newUninitializedMessageException(
            result).asInvalidProtocolBufferException();
        }
        return buildPartial();
      }
      
      public com.alachisoft.tayzgrid.common.protobuf.GetOptimalServerCommandProtocol.GetOptimalServerCommand buildPartial() {
        if (result == null) {
          throw new IllegalStateException(
            "build() has already been called on this Builder.");
        }
        com.alachisoft.tayzgrid.common.protobuf.GetOptimalServerCommandProtocol.GetOptimalServerCommand returnMe = result;
        result = null;
        return returnMe;
      }
      
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof com.alachisoft.tayzgrid.common.protobuf.GetOptimalServerCommandProtocol.GetOptimalServerCommand) {
          return mergeFrom((com.alachisoft.tayzgrid.common.protobuf.GetOptimalServerCommandProtocol.GetOptimalServerCommand)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }
      
      public Builder mergeFrom(com.alachisoft.tayzgrid.common.protobuf.GetOptimalServerCommandProtocol.GetOptimalServerCommand other) {
        if (other == com.alachisoft.tayzgrid.common.protobuf.GetOptimalServerCommandProtocol.GetOptimalServerCommand.getDefaultInstance()) return this;
        if (other.hasRequestId()) {
          setRequestId(other.getRequestId());
        }
        if (other.hasCacheId()) {
          setCacheId(other.getCacheId());
        }
        if (other.hasIsDotnetClient()) {
          setIsDotnetClient(other.getIsDotnetClient());
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
              setRequestId(input.readInt64());
              break;
            }
            case 18: {
              setCacheId(input.readString());
              break;
            }
            case 24: {
              setIsDotnetClient(input.readBool());
              break;
            }
          }
        }
      }
      
      
      // optional int64 requestId = 1;
      public boolean hasRequestId() {
        return result.hasRequestId();
      }
      public long getRequestId() {
        return result.getRequestId();
      }
      public Builder setRequestId(long value) {
        result.hasRequestId = true;
        result.requestId_ = value;
        return this;
      }
      public Builder clearRequestId() {
        result.hasRequestId = false;
        result.requestId_ = 0L;
        return this;
      }
      
      // optional string cacheId = 2;
      public boolean hasCacheId() {
        return result.hasCacheId();
      }
      public java.lang.String getCacheId() {
        return result.getCacheId();
      }
      public Builder setCacheId(java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  result.hasCacheId = true;
        result.cacheId_ = value;
        return this;
      }
      public Builder clearCacheId() {
        result.hasCacheId = false;
        result.cacheId_ = getDefaultInstance().getCacheId();
        return this;
      }
      
      // optional bool isDotnetClient = 3 [default = true];
      public boolean hasIsDotnetClient() {
        return result.hasIsDotnetClient();
      }
      public boolean getIsDotnetClient() {
        return result.getIsDotnetClient();
      }
      public Builder setIsDotnetClient(boolean value) {
        result.hasIsDotnetClient = true;
        result.isDotnetClient_ = value;
        return this;
      }
      public Builder clearIsDotnetClient() {
        result.hasIsDotnetClient = false;
        result.isDotnetClient_ = true;
        return this;
      }
      
      // @@protoc_insertion_point(builder_scope:com.alachisoft.tayzgrid.common.protobuf.GetOptimalServerCommand)
    }
    
    static {
      defaultInstance = new GetOptimalServerCommand(true);
      com.alachisoft.tayzgrid.common.protobuf.GetOptimalServerCommandProtocol.internalForceInit();
      defaultInstance.initFields();
    }
    
    // @@protoc_insertion_point(class_scope:com.alachisoft.tayzgrid.common.protobuf.GetOptimalServerCommand)
  }
  
  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_com_alachisoft_tayzgrid_common_protobuf_GetOptimalServerCommand_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_com_alachisoft_tayzgrid_common_protobuf_GetOptimalServerCommand_fieldAccessorTable;
  
  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\035GetOptimalServerCommand.proto\022\'com.ala" +
      "chisoft.tayzgrid.common.protobuf\"[\n\027GetO" +
      "ptimalServerCommand\022\021\n\trequestId\030\001 \001(\003\022\017" +
      "\n\007cacheId\030\002 \001(\t\022\034\n\016isDotnetClient\030\003 \001(\010:" +
      "\004trueB!B\037GetOptimalServerCommandProtocol"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
      new com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner() {
        public com.google.protobuf.ExtensionRegistry assignDescriptors(
            com.google.protobuf.Descriptors.FileDescriptor root) {
          descriptor = root;
          internal_static_com_alachisoft_tayzgrid_common_protobuf_GetOptimalServerCommand_descriptor =
            getDescriptor().getMessageTypes().get(0);
          internal_static_com_alachisoft_tayzgrid_common_protobuf_GetOptimalServerCommand_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_com_alachisoft_tayzgrid_common_protobuf_GetOptimalServerCommand_descriptor,
              new java.lang.String[] { "RequestId", "CacheId", "IsDotnetClient", },
              com.alachisoft.tayzgrid.common.protobuf.GetOptimalServerCommandProtocol.GetOptimalServerCommand.class,
              com.alachisoft.tayzgrid.common.protobuf.GetOptimalServerCommandProtocol.GetOptimalServerCommand.Builder.class);
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
