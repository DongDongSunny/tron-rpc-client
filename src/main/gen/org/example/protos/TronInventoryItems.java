// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: core/TronInventoryItems.proto

package org.example.protos;

public final class TronInventoryItems {
  private TronInventoryItems() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface InventoryItemsOrBuilder extends
      // @@protoc_insertion_point(interface_extends:protocol.InventoryItems)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>int32 type = 1;</code>
     * @return The type.
     */
    int getType();

    /**
     * <code>repeated bytes items = 2;</code>
     * @return A list containing the items.
     */
    java.util.List<com.google.protobuf.ByteString> getItemsList();
    /**
     * <code>repeated bytes items = 2;</code>
     * @return The count of items.
     */
    int getItemsCount();
    /**
     * <code>repeated bytes items = 2;</code>
     * @param index The index of the element to return.
     * @return The items at the given index.
     */
    com.google.protobuf.ByteString getItems(int index);
  }
  /**
   * Protobuf type {@code protocol.InventoryItems}
   */
  public static final class InventoryItems extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:protocol.InventoryItems)
      InventoryItemsOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use InventoryItems.newBuilder() to construct.
    private InventoryItems(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private InventoryItems() {
      items_ = java.util.Collections.emptyList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new InventoryItems();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.example.protos.TronInventoryItems.internal_static_protocol_InventoryItems_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.example.protos.TronInventoryItems.internal_static_protocol_InventoryItems_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.example.protos.TronInventoryItems.InventoryItems.class, org.example.protos.TronInventoryItems.InventoryItems.Builder.class);
    }

    public static final int TYPE_FIELD_NUMBER = 1;
    private int type_ = 0;
    /**
     * <code>int32 type = 1;</code>
     * @return The type.
     */
    @java.lang.Override
    public int getType() {
      return type_;
    }

    public static final int ITEMS_FIELD_NUMBER = 2;
    @SuppressWarnings("serial")
    private java.util.List<com.google.protobuf.ByteString> items_;
    /**
     * <code>repeated bytes items = 2;</code>
     * @return A list containing the items.
     */
    @java.lang.Override
    public java.util.List<com.google.protobuf.ByteString>
        getItemsList() {
      return items_;
    }
    /**
     * <code>repeated bytes items = 2;</code>
     * @return The count of items.
     */
    public int getItemsCount() {
      return items_.size();
    }
    /**
     * <code>repeated bytes items = 2;</code>
     * @param index The index of the element to return.
     * @return The items at the given index.
     */
    public com.google.protobuf.ByteString getItems(int index) {
      return items_.get(index);
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
      if (type_ != 0) {
        output.writeInt32(1, type_);
      }
      for (int i = 0; i < items_.size(); i++) {
        output.writeBytes(2, items_.get(i));
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (type_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(1, type_);
      }
      {
        int dataSize = 0;
        for (int i = 0; i < items_.size(); i++) {
          dataSize += com.google.protobuf.CodedOutputStream
            .computeBytesSizeNoTag(items_.get(i));
        }
        size += dataSize;
        size += 1 * getItemsList().size();
      }
      size += getUnknownFields().getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof org.example.protos.TronInventoryItems.InventoryItems)) {
        return super.equals(obj);
      }
      org.example.protos.TronInventoryItems.InventoryItems other = (org.example.protos.TronInventoryItems.InventoryItems) obj;

      if (getType()
          != other.getType()) return false;
      if (!getItemsList()
          .equals(other.getItemsList())) return false;
      if (!getUnknownFields().equals(other.getUnknownFields())) return false;
      return true;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      hash = (37 * hash) + TYPE_FIELD_NUMBER;
      hash = (53 * hash) + getType();
      if (getItemsCount() > 0) {
        hash = (37 * hash) + ITEMS_FIELD_NUMBER;
        hash = (53 * hash) + getItemsList().hashCode();
      }
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static org.example.protos.TronInventoryItems.InventoryItems parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.example.protos.TronInventoryItems.InventoryItems parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.example.protos.TronInventoryItems.InventoryItems parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.example.protos.TronInventoryItems.InventoryItems parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.example.protos.TronInventoryItems.InventoryItems parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.example.protos.TronInventoryItems.InventoryItems parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.example.protos.TronInventoryItems.InventoryItems parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static org.example.protos.TronInventoryItems.InventoryItems parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static org.example.protos.TronInventoryItems.InventoryItems parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static org.example.protos.TronInventoryItems.InventoryItems parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static org.example.protos.TronInventoryItems.InventoryItems parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static org.example.protos.TronInventoryItems.InventoryItems parseFrom(
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
    public static Builder newBuilder(org.example.protos.TronInventoryItems.InventoryItems prototype) {
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
     * Protobuf type {@code protocol.InventoryItems}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:protocol.InventoryItems)
        org.example.protos.TronInventoryItems.InventoryItemsOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return org.example.protos.TronInventoryItems.internal_static_protocol_InventoryItems_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return org.example.protos.TronInventoryItems.internal_static_protocol_InventoryItems_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                org.example.protos.TronInventoryItems.InventoryItems.class, org.example.protos.TronInventoryItems.InventoryItems.Builder.class);
      }

      // Construct using org.example.protos.TronInventoryItems.InventoryItems.newBuilder()
      private Builder() {

      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);

      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        bitField0_ = 0;
        type_ = 0;
        items_ = java.util.Collections.emptyList();
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return org.example.protos.TronInventoryItems.internal_static_protocol_InventoryItems_descriptor;
      }

      @java.lang.Override
      public org.example.protos.TronInventoryItems.InventoryItems getDefaultInstanceForType() {
        return org.example.protos.TronInventoryItems.InventoryItems.getDefaultInstance();
      }

      @java.lang.Override
      public org.example.protos.TronInventoryItems.InventoryItems build() {
        org.example.protos.TronInventoryItems.InventoryItems result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public org.example.protos.TronInventoryItems.InventoryItems buildPartial() {
        org.example.protos.TronInventoryItems.InventoryItems result = new org.example.protos.TronInventoryItems.InventoryItems(this);
        buildPartialRepeatedFields(result);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartialRepeatedFields(org.example.protos.TronInventoryItems.InventoryItems result) {
        if (((bitField0_ & 0x00000002) != 0)) {
          items_ = java.util.Collections.unmodifiableList(items_);
          bitField0_ = (bitField0_ & ~0x00000002);
        }
        result.items_ = items_;
      }

      private void buildPartial0(org.example.protos.TronInventoryItems.InventoryItems result) {
        int from_bitField0_ = bitField0_;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          result.type_ = type_;
        }
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
        if (other instanceof org.example.protos.TronInventoryItems.InventoryItems) {
          return mergeFrom((org.example.protos.TronInventoryItems.InventoryItems)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(org.example.protos.TronInventoryItems.InventoryItems other) {
        if (other == org.example.protos.TronInventoryItems.InventoryItems.getDefaultInstance()) return this;
        if (other.getType() != 0) {
          setType(other.getType());
        }
        if (!other.items_.isEmpty()) {
          if (items_.isEmpty()) {
            items_ = other.items_;
            bitField0_ = (bitField0_ & ~0x00000002);
          } else {
            ensureItemsIsMutable();
            items_.addAll(other.items_);
          }
          onChanged();
        }
        this.mergeUnknownFields(other.getUnknownFields());
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
        if (extensionRegistry == null) {
          throw new java.lang.NullPointerException();
        }
        try {
          boolean done = false;
          while (!done) {
            int tag = input.readTag();
            switch (tag) {
              case 0:
                done = true;
                break;
              case 8: {
                type_ = input.readInt32();
                bitField0_ |= 0x00000001;
                break;
              } // case 8
              case 18: {
                com.google.protobuf.ByteString v = input.readBytes();
                ensureItemsIsMutable();
                items_.add(v);
                break;
              } // case 18
              default: {
                if (!super.parseUnknownField(input, extensionRegistry, tag)) {
                  done = true; // was an endgroup tag
                }
                break;
              } // default:
            } // switch (tag)
          } // while (!done)
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          throw e.unwrapIOException();
        } finally {
          onChanged();
        } // finally
        return this;
      }
      private int bitField0_;

      private int type_ ;
      /**
       * <code>int32 type = 1;</code>
       * @return The type.
       */
      @java.lang.Override
      public int getType() {
        return type_;
      }
      /**
       * <code>int32 type = 1;</code>
       * @param value The type to set.
       * @return This builder for chaining.
       */
      public Builder setType(int value) {
        
        type_ = value;
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>int32 type = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearType() {
        bitField0_ = (bitField0_ & ~0x00000001);
        type_ = 0;
        onChanged();
        return this;
      }

      private java.util.List<com.google.protobuf.ByteString> items_ = java.util.Collections.emptyList();
      private void ensureItemsIsMutable() {
        if (!((bitField0_ & 0x00000002) != 0)) {
          items_ = new java.util.ArrayList<com.google.protobuf.ByteString>(items_);
          bitField0_ |= 0x00000002;
        }
      }
      /**
       * <code>repeated bytes items = 2;</code>
       * @return A list containing the items.
       */
      public java.util.List<com.google.protobuf.ByteString>
          getItemsList() {
        return ((bitField0_ & 0x00000002) != 0) ?
                 java.util.Collections.unmodifiableList(items_) : items_;
      }
      /**
       * <code>repeated bytes items = 2;</code>
       * @return The count of items.
       */
      public int getItemsCount() {
        return items_.size();
      }
      /**
       * <code>repeated bytes items = 2;</code>
       * @param index The index of the element to return.
       * @return The items at the given index.
       */
      public com.google.protobuf.ByteString getItems(int index) {
        return items_.get(index);
      }
      /**
       * <code>repeated bytes items = 2;</code>
       * @param index The index to set the value at.
       * @param value The items to set.
       * @return This builder for chaining.
       */
      public Builder setItems(
          int index, com.google.protobuf.ByteString value) {
        if (value == null) { throw new NullPointerException(); }
        ensureItemsIsMutable();
        items_.set(index, value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated bytes items = 2;</code>
       * @param value The items to add.
       * @return This builder for chaining.
       */
      public Builder addItems(com.google.protobuf.ByteString value) {
        if (value == null) { throw new NullPointerException(); }
        ensureItemsIsMutable();
        items_.add(value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated bytes items = 2;</code>
       * @param values The items to add.
       * @return This builder for chaining.
       */
      public Builder addAllItems(
          java.lang.Iterable<? extends com.google.protobuf.ByteString> values) {
        ensureItemsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, items_);
        onChanged();
        return this;
      }
      /**
       * <code>repeated bytes items = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearItems() {
        items_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000002);
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


      // @@protoc_insertion_point(builder_scope:protocol.InventoryItems)
    }

    // @@protoc_insertion_point(class_scope:protocol.InventoryItems)
    private static final org.example.protos.TronInventoryItems.InventoryItems DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new org.example.protos.TronInventoryItems.InventoryItems();
    }

    public static org.example.protos.TronInventoryItems.InventoryItems getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<InventoryItems>
        PARSER = new com.google.protobuf.AbstractParser<InventoryItems>() {
      @java.lang.Override
      public InventoryItems parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        Builder builder = newBuilder();
        try {
          builder.mergeFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          throw e.setUnfinishedMessage(builder.buildPartial());
        } catch (com.google.protobuf.UninitializedMessageException e) {
          throw e.asInvalidProtocolBufferException().setUnfinishedMessage(builder.buildPartial());
        } catch (java.io.IOException e) {
          throw new com.google.protobuf.InvalidProtocolBufferException(e)
              .setUnfinishedMessage(builder.buildPartial());
        }
        return builder.buildPartial();
      }
    };

    public static com.google.protobuf.Parser<InventoryItems> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<InventoryItems> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public org.example.protos.TronInventoryItems.InventoryItems getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_protocol_InventoryItems_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_protocol_InventoryItems_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\035core/TronInventoryItems.proto\022\010protoco" +
      "l\"-\n\016InventoryItems\022\014\n\004type\030\001 \001(\005\022\r\n\005ite" +
      "ms\030\002 \003(\014BS\n\022org.example.protosB\022TronInve" +
      "ntoryItemsZ)github.com/tronprotocol/grpc" +
      "-gateway/coreb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_protocol_InventoryItems_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_protocol_InventoryItems_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_protocol_InventoryItems_descriptor,
        new java.lang.String[] { "Type", "Items", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
