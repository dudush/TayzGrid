// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: UnregisterKeyNotifResponse.proto

package com.alachisoft.tayzgrid.common.protobuf;

public final class UnregisterKeyNotifResponseProtocol {
  private UnregisterKeyNotifResponseProtocol() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  public static final class UnregisterKeyNotifResponse extends
      com.google.protobuf.GeneratedMessage {
    // Use UnregisterKeyNotifResponse.newBuilder() to construct.
    private UnregisterKeyNotifResponse() {
      initFields();
    }
    private UnregisterKeyNotifResponse(boolean noInit) {}
    
    private static final UnregisterKeyNotifResponse defaultInstance;
    public static UnregisterKeyNotifResponse getDefaultInstance() {
      return defaultInstance;
    }
    
    public UnregisterKeyNotifResponse getDefaultInstanceForType() {
      return defaultInstance;
    }
    
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.alachisoft.tayzgrid.common.protobuf.UnregisterKeyNotifResponseProtocol.internal_static_com_alachisoft_tayzgrid_common_protobuf_UnregisterKeyNotifResponse_descriptor;
    }
    
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.alachisoft.tayzgrid.common.protobuf.UnregisterKeyNotifResponseProtocol.internal_static_com_alachisoft_tayzgrid_common_protobuf_UnregisterKeyNotifResponse_fieldAccessorTable;
    }
    
    private void initFields() {
    }
    public final boolean isInitialized() {
      return true;
    }
    
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      getSerializedSize();
      getUnknownFields().writeTo(output);
    }
    
    private int memoizedSerializedSize = -1;
    public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != -1) return size;
    
      size = 0;
      size += getUnknownFields().getSerializedSize();
      memoizedSerializedSize = size;
      return size;
    }
    
    public static com.alachisoft.tayzgrid.common.protobuf.UnregisterKeyNotifResponseProtocol.UnregisterKeyNotifResponse parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static com.alachisoft.tayzgrid.common.protobuf.UnregisterKeyNotifResponseProtocol.UnregisterKeyNotifResponse parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static com.alachisoft.tayzgrid.common.protobuf.UnregisterKeyNotifResponseProtocol.UnregisterKeyNotifResponse parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static com.alachisoft.tayzgrid.common.protobuf.UnregisterKeyNotifResponseProtocol.UnregisterKeyNotifResponse parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static com.alachisoft.tayzgrid.common.protobuf.UnregisterKeyNotifResponseProtocol.UnregisterKeyNotifResponse parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static com.alachisoft.tayzgrid.common.protobuf.UnregisterKeyNotifResponseProtocol.UnregisterKeyNotifResponse parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    public static com.alachisoft.tayzgrid.common.protobuf.UnregisterKeyNotifResponseProtocol.UnregisterKeyNotifResponse parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      Builder builder = newBuilder();
      if (builder.mergeDelimitedFrom(input)) {
        return builder.buildParsed();
      } else {
        return null;
      }
    }
    public static com.alachisoft.tayzgrid.common.protobuf.UnregisterKeyNotifResponseProtocol.UnregisterKeyNotifResponse parseDelimitedFrom(
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
    public static com.alachisoft.tayzgrid.common.protobuf.UnregisterKeyNotifResponseProtocol.UnregisterKeyNotifResponse parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static com.alachisoft.tayzgrid.common.protobuf.UnregisterKeyNotifResponseProtocol.UnregisterKeyNotifResponse parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    
    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(com.alachisoft.tayzgrid.common.protobuf.UnregisterKeyNotifResponseProtocol.UnregisterKeyNotifResponse prototype) {
      return newBuilder().mergeFrom(prototype);
    }
    public Builder toBuilder() { return newBuilder(this); }
    
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder> {
      private com.alachisoft.tayzgrid.common.protobuf.UnregisterKeyNotifResponseProtocol.UnregisterKeyNotifResponse result;
      
      // Construct using com.alachisoft.tayzgrid.common.protobuf.UnregisterKeyNotifResponseProtocol.UnregisterKeyNotifResponse.newBuilder()
      private Builder() {}
      
      private static Builder create() {
        Builder builder = new Builder();
        builder.result = new com.alachisoft.tayzgrid.common.protobuf.UnregisterKeyNotifResponseProtocol.UnregisterKeyNotifResponse();
        return builder;
      }
      
      protected com.alachisoft.tayzgrid.common.protobuf.UnregisterKeyNotifResponseProtocol.UnregisterKeyNotifResponse internalGetResult() {
        return result;
      }
      
      public Builder clear() {
        if (result == null) {
          throw new IllegalStateException(
            "Cannot call clear() after build().");
        }
        result = new com.alachisoft.tayzgrid.common.protobuf.UnregisterKeyNotifResponseProtocol.UnregisterKeyNotifResponse();
        return this;
      }
      
      public Builder clone() {
        return create().mergeFrom(result);
      }
      
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.alachisoft.tayzgrid.common.protobuf.UnregisterKeyNotifResponseProtocol.UnregisterKeyNotifResponse.getDescriptor();
      }
      
      public com.alachisoft.tayzgrid.common.protobuf.UnregisterKeyNotifResponseProtocol.UnregisterKeyNotifResponse getDefaultInstanceForType() {
        return com.alachisoft.tayzgrid.common.protobuf.UnregisterKeyNotifResponseProtocol.UnregisterKeyNotifResponse.getDefaultInstance();
      }
      
      public boolean isInitialized() {
        return result.isInitialized();
      }
      public com.alachisoft.tayzgrid.common.protobuf.UnregisterKeyNotifResponseProtocol.UnregisterKeyNotifResponse build() {
        if (result != null && !isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return buildPartial();
      }
      
      private com.alachisoft.tayzgrid.common.protobuf.UnregisterKeyNotifResponseProtocol.UnregisterKeyNotifResponse buildParsed()
          throws com.google.protobuf.InvalidProtocolBufferException {
        if (!isInitialized()) {
          throw newUninitializedMessageException(
            result).asInvalidProtocolBufferException();
        }
        return buildPartial();
      }
      
      public com.alachisoft.tayzgrid.common.protobuf.UnregisterKeyNotifResponseProtocol.UnregisterKeyNotifResponse buildPartial() {
        if (result == null) {
          throw new IllegalStateException(
            "build() has already been called on this Builder.");
        }
        com.alachisoft.tayzgrid.common.protobuf.UnregisterKeyNotifResponseProtocol.UnregisterKeyNotifResponse returnMe = result;
        result = null;
        return returnMe;
      }
      
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof com.alachisoft.tayzgrid.common.protobuf.UnregisterKeyNotifResponseProtocol.UnregisterKeyNotifResponse) {
          return mergeFrom((com.alachisoft.tayzgrid.common.protobuf.UnregisterKeyNotifResponseProtocol.UnregisterKeyNotifResponse)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }
      
      public Builder mergeFrom(com.alachisoft.tayzgrid.common.protobuf.UnregisterKeyNotifResponseProtocol.UnregisterKeyNotifResponse other) {
        if (other == com.alachisoft.tayzgrid.common.protobuf.UnregisterKeyNotifResponseProtocol.UnregisterKeyNotifResponse.getDefaultInstance()) return this;
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
          }
        }
      }
      
      
      // @@protoc_insertion_point(builder_scope:com.alachisoft.tayzgrid.common.protobuf.UnregisterKeyNotifResponse)
    }
    
    static {
      defaultInstance = new UnregisterKeyNotifResponse(true);
      com.alachisoft.tayzgrid.common.protobuf.UnregisterKeyNotifResponseProtocol.internalForceInit();
      defaultInstance.initFields();
    }
    
    // @@protoc_insertion_point(class_scope:com.alachisoft.tayzgrid.common.protobuf.UnregisterKeyNotifResponse)
  }
  
  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_com_alachisoft_tayzgrid_common_protobuf_UnregisterKeyNotifResponse_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_com_alachisoft_tayzgrid_common_protobuf_UnregisterKeyNotifResponse_fieldAccessorTable;
  
  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n UnregisterKeyNotifResponse.proto\022\'com." +
      "alachisoft.tayzgrid.common.protobuf\"\034\n\032U" +
      "nregisterKeyNotifResponseB$B\"UnregisterK" +
      "eyNotifResponseProtocol"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
      new com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner() {
        public com.google.protobuf.ExtensionRegistry assignDescriptors(
            com.google.protobuf.Descriptors.FileDescriptor root) {
          descriptor = root;
          internal_static_com_alachisoft_tayzgrid_common_protobuf_UnregisterKeyNotifResponse_descriptor =
            getDescriptor().getMessageTypes().get(0);
          internal_static_com_alachisoft_tayzgrid_common_protobuf_UnregisterKeyNotifResponse_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_com_alachisoft_tayzgrid_common_protobuf_UnregisterKeyNotifResponse_descriptor,
              new java.lang.String[] { },
              com.alachisoft.tayzgrid.common.protobuf.UnregisterKeyNotifResponseProtocol.UnregisterKeyNotifResponse.class,
              com.alachisoft.tayzgrid.common.protobuf.UnregisterKeyNotifResponseProtocol.UnregisterKeyNotifResponse.Builder.class);
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