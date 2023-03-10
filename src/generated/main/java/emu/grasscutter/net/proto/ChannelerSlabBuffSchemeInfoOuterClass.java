// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ChannelerSlabBuffSchemeInfo.proto

package emu.grasscutter.net.proto;

public final class ChannelerSlabBuffSchemeInfoOuterClass {
  private ChannelerSlabBuffSchemeInfoOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface ChannelerSlabBuffSchemeInfoOrBuilder extends
      // @@protoc_insertion_point(interface_extends:ChannelerSlabBuffSchemeInfo)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>map&lt;uint32, uint32&gt; slotMap = 9;</code>
     */
    int getSlotMapCount();
    /**
     * <code>map&lt;uint32, uint32&gt; slotMap = 9;</code>
     */
    boolean containsSlotMap(
        int key);
    /**
     * Use {@link #getSlotMapMap()} instead.
     */
    @java.lang.Deprecated
    java.util.Map<java.lang.Integer, java.lang.Integer>
    getSlotMap();
    /**
     * <code>map&lt;uint32, uint32&gt; slotMap = 9;</code>
     */
    java.util.Map<java.lang.Integer, java.lang.Integer>
    getSlotMapMap();
    /**
     * <code>map&lt;uint32, uint32&gt; slotMap = 9;</code>
     */
    int getSlotMapOrDefault(
        int key,
        int defaultValue);
    /**
     * <code>map&lt;uint32, uint32&gt; slotMap = 9;</code>
     */
    int getSlotMapOrThrow(
        int key);

    /**
     * <code>uint32 Unk3300_NCMDDAFNENO = 1;</code>
     * @return The unk3300NCMDDAFNENO.
     */
    int getUnk3300NCMDDAFNENO();

    /**
     * <code>uint32 Unk3300_CKMNFOCNMGL = 10;</code>
     * @return The unk3300CKMNFOCNMGL.
     */
    int getUnk3300CKMNFOCNMGL();
  }
  /**
   * Protobuf type {@code ChannelerSlabBuffSchemeInfo}
   */
  public static final class ChannelerSlabBuffSchemeInfo extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:ChannelerSlabBuffSchemeInfo)
      ChannelerSlabBuffSchemeInfoOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use ChannelerSlabBuffSchemeInfo.newBuilder() to construct.
    private ChannelerSlabBuffSchemeInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private ChannelerSlabBuffSchemeInfo() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new ChannelerSlabBuffSchemeInfo();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.ChannelerSlabBuffSchemeInfoOuterClass.internal_static_ChannelerSlabBuffSchemeInfo_descriptor;
    }

    @SuppressWarnings({"rawtypes"})
    @java.lang.Override
    protected com.google.protobuf.MapField internalGetMapField(
        int number) {
      switch (number) {
        case 9:
          return internalGetSlotMap();
        default:
          throw new RuntimeException(
              "Invalid map field number: " + number);
      }
    }
    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.ChannelerSlabBuffSchemeInfoOuterClass.internal_static_ChannelerSlabBuffSchemeInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.ChannelerSlabBuffSchemeInfoOuterClass.ChannelerSlabBuffSchemeInfo.class, emu.grasscutter.net.proto.ChannelerSlabBuffSchemeInfoOuterClass.ChannelerSlabBuffSchemeInfo.Builder.class);
    }

    public static final int SLOTMAP_FIELD_NUMBER = 9;
    private static final class SlotMapDefaultEntryHolder {
      static final com.google.protobuf.MapEntry<
          java.lang.Integer, java.lang.Integer> defaultEntry =
              com.google.protobuf.MapEntry
              .<java.lang.Integer, java.lang.Integer>newDefaultInstance(
                  emu.grasscutter.net.proto.ChannelerSlabBuffSchemeInfoOuterClass.internal_static_ChannelerSlabBuffSchemeInfo_SlotMapEntry_descriptor, 
                  com.google.protobuf.WireFormat.FieldType.UINT32,
                  0,
                  com.google.protobuf.WireFormat.FieldType.UINT32,
                  0);
    }
    @SuppressWarnings("serial")
    private com.google.protobuf.MapField<
        java.lang.Integer, java.lang.Integer> slotMap_;
    private com.google.protobuf.MapField<java.lang.Integer, java.lang.Integer>
    internalGetSlotMap() {
      if (slotMap_ == null) {
        return com.google.protobuf.MapField.emptyMapField(
            SlotMapDefaultEntryHolder.defaultEntry);
      }
      return slotMap_;
    }
    public int getSlotMapCount() {
      return internalGetSlotMap().getMap().size();
    }
    /**
     * <code>map&lt;uint32, uint32&gt; slotMap = 9;</code>
     */
    @java.lang.Override
    public boolean containsSlotMap(
        int key) {
      
      return internalGetSlotMap().getMap().containsKey(key);
    }
    /**
     * Use {@link #getSlotMapMap()} instead.
     */
    @java.lang.Override
    @java.lang.Deprecated
    public java.util.Map<java.lang.Integer, java.lang.Integer> getSlotMap() {
      return getSlotMapMap();
    }
    /**
     * <code>map&lt;uint32, uint32&gt; slotMap = 9;</code>
     */
    @java.lang.Override
    public java.util.Map<java.lang.Integer, java.lang.Integer> getSlotMapMap() {
      return internalGetSlotMap().getMap();
    }
    /**
     * <code>map&lt;uint32, uint32&gt; slotMap = 9;</code>
     */
    @java.lang.Override
    public int getSlotMapOrDefault(
        int key,
        int defaultValue) {
      
      java.util.Map<java.lang.Integer, java.lang.Integer> map =
          internalGetSlotMap().getMap();
      return map.containsKey(key) ? map.get(key) : defaultValue;
    }
    /**
     * <code>map&lt;uint32, uint32&gt; slotMap = 9;</code>
     */
    @java.lang.Override
    public int getSlotMapOrThrow(
        int key) {
      
      java.util.Map<java.lang.Integer, java.lang.Integer> map =
          internalGetSlotMap().getMap();
      if (!map.containsKey(key)) {
        throw new java.lang.IllegalArgumentException();
      }
      return map.get(key);
    }

    public static final int UNK3300_NCMDDAFNENO_FIELD_NUMBER = 1;
    private int unk3300NCMDDAFNENO_ = 0;
    /**
     * <code>uint32 Unk3300_NCMDDAFNENO = 1;</code>
     * @return The unk3300NCMDDAFNENO.
     */
    @java.lang.Override
    public int getUnk3300NCMDDAFNENO() {
      return unk3300NCMDDAFNENO_;
    }

    public static final int UNK3300_CKMNFOCNMGL_FIELD_NUMBER = 10;
    private int unk3300CKMNFOCNMGL_ = 0;
    /**
     * <code>uint32 Unk3300_CKMNFOCNMGL = 10;</code>
     * @return The unk3300CKMNFOCNMGL.
     */
    @java.lang.Override
    public int getUnk3300CKMNFOCNMGL() {
      return unk3300CKMNFOCNMGL_;
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
      if (unk3300NCMDDAFNENO_ != 0) {
        output.writeUInt32(1, unk3300NCMDDAFNENO_);
      }
      com.google.protobuf.GeneratedMessageV3
        .serializeIntegerMapTo(
          output,
          internalGetSlotMap(),
          SlotMapDefaultEntryHolder.defaultEntry,
          9);
      if (unk3300CKMNFOCNMGL_ != 0) {
        output.writeUInt32(10, unk3300CKMNFOCNMGL_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (unk3300NCMDDAFNENO_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(1, unk3300NCMDDAFNENO_);
      }
      for (java.util.Map.Entry<java.lang.Integer, java.lang.Integer> entry
           : internalGetSlotMap().getMap().entrySet()) {
        com.google.protobuf.MapEntry<java.lang.Integer, java.lang.Integer>
        slotMap__ = SlotMapDefaultEntryHolder.defaultEntry.newBuilderForType()
            .setKey(entry.getKey())
            .setValue(entry.getValue())
            .build();
        size += com.google.protobuf.CodedOutputStream
            .computeMessageSize(9, slotMap__);
      }
      if (unk3300CKMNFOCNMGL_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(10, unk3300CKMNFOCNMGL_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.ChannelerSlabBuffSchemeInfoOuterClass.ChannelerSlabBuffSchemeInfo)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.ChannelerSlabBuffSchemeInfoOuterClass.ChannelerSlabBuffSchemeInfo other = (emu.grasscutter.net.proto.ChannelerSlabBuffSchemeInfoOuterClass.ChannelerSlabBuffSchemeInfo) obj;

      if (!internalGetSlotMap().equals(
          other.internalGetSlotMap())) return false;
      if (getUnk3300NCMDDAFNENO()
          != other.getUnk3300NCMDDAFNENO()) return false;
      if (getUnk3300CKMNFOCNMGL()
          != other.getUnk3300CKMNFOCNMGL()) return false;
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
      if (!internalGetSlotMap().getMap().isEmpty()) {
        hash = (37 * hash) + SLOTMAP_FIELD_NUMBER;
        hash = (53 * hash) + internalGetSlotMap().hashCode();
      }
      hash = (37 * hash) + UNK3300_NCMDDAFNENO_FIELD_NUMBER;
      hash = (53 * hash) + getUnk3300NCMDDAFNENO();
      hash = (37 * hash) + UNK3300_CKMNFOCNMGL_FIELD_NUMBER;
      hash = (53 * hash) + getUnk3300CKMNFOCNMGL();
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.ChannelerSlabBuffSchemeInfoOuterClass.ChannelerSlabBuffSchemeInfo parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.ChannelerSlabBuffSchemeInfoOuterClass.ChannelerSlabBuffSchemeInfo parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.ChannelerSlabBuffSchemeInfoOuterClass.ChannelerSlabBuffSchemeInfo parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.ChannelerSlabBuffSchemeInfoOuterClass.ChannelerSlabBuffSchemeInfo parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.ChannelerSlabBuffSchemeInfoOuterClass.ChannelerSlabBuffSchemeInfo parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.ChannelerSlabBuffSchemeInfoOuterClass.ChannelerSlabBuffSchemeInfo parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.ChannelerSlabBuffSchemeInfoOuterClass.ChannelerSlabBuffSchemeInfo parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.ChannelerSlabBuffSchemeInfoOuterClass.ChannelerSlabBuffSchemeInfo parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.ChannelerSlabBuffSchemeInfoOuterClass.ChannelerSlabBuffSchemeInfo parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.ChannelerSlabBuffSchemeInfoOuterClass.ChannelerSlabBuffSchemeInfo parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.ChannelerSlabBuffSchemeInfoOuterClass.ChannelerSlabBuffSchemeInfo parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.ChannelerSlabBuffSchemeInfoOuterClass.ChannelerSlabBuffSchemeInfo parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.ChannelerSlabBuffSchemeInfoOuterClass.ChannelerSlabBuffSchemeInfo prototype) {
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
     * Protobuf type {@code ChannelerSlabBuffSchemeInfo}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:ChannelerSlabBuffSchemeInfo)
        emu.grasscutter.net.proto.ChannelerSlabBuffSchemeInfoOuterClass.ChannelerSlabBuffSchemeInfoOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.ChannelerSlabBuffSchemeInfoOuterClass.internal_static_ChannelerSlabBuffSchemeInfo_descriptor;
      }

      @SuppressWarnings({"rawtypes"})
      protected com.google.protobuf.MapField internalGetMapField(
          int number) {
        switch (number) {
          case 9:
            return internalGetSlotMap();
          default:
            throw new RuntimeException(
                "Invalid map field number: " + number);
        }
      }
      @SuppressWarnings({"rawtypes"})
      protected com.google.protobuf.MapField internalGetMutableMapField(
          int number) {
        switch (number) {
          case 9:
            return internalGetMutableSlotMap();
          default:
            throw new RuntimeException(
                "Invalid map field number: " + number);
        }
      }
      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.ChannelerSlabBuffSchemeInfoOuterClass.internal_static_ChannelerSlabBuffSchemeInfo_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.ChannelerSlabBuffSchemeInfoOuterClass.ChannelerSlabBuffSchemeInfo.class, emu.grasscutter.net.proto.ChannelerSlabBuffSchemeInfoOuterClass.ChannelerSlabBuffSchemeInfo.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.ChannelerSlabBuffSchemeInfoOuterClass.ChannelerSlabBuffSchemeInfo.newBuilder()
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
        internalGetMutableSlotMap().clear();
        unk3300NCMDDAFNENO_ = 0;
        unk3300CKMNFOCNMGL_ = 0;
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.ChannelerSlabBuffSchemeInfoOuterClass.internal_static_ChannelerSlabBuffSchemeInfo_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.ChannelerSlabBuffSchemeInfoOuterClass.ChannelerSlabBuffSchemeInfo getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.ChannelerSlabBuffSchemeInfoOuterClass.ChannelerSlabBuffSchemeInfo.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.ChannelerSlabBuffSchemeInfoOuterClass.ChannelerSlabBuffSchemeInfo build() {
        emu.grasscutter.net.proto.ChannelerSlabBuffSchemeInfoOuterClass.ChannelerSlabBuffSchemeInfo result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.ChannelerSlabBuffSchemeInfoOuterClass.ChannelerSlabBuffSchemeInfo buildPartial() {
        emu.grasscutter.net.proto.ChannelerSlabBuffSchemeInfoOuterClass.ChannelerSlabBuffSchemeInfo result = new emu.grasscutter.net.proto.ChannelerSlabBuffSchemeInfoOuterClass.ChannelerSlabBuffSchemeInfo(this);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartial0(emu.grasscutter.net.proto.ChannelerSlabBuffSchemeInfoOuterClass.ChannelerSlabBuffSchemeInfo result) {
        int from_bitField0_ = bitField0_;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          result.slotMap_ = internalGetSlotMap();
          result.slotMap_.makeImmutable();
        }
        if (((from_bitField0_ & 0x00000002) != 0)) {
          result.unk3300NCMDDAFNENO_ = unk3300NCMDDAFNENO_;
        }
        if (((from_bitField0_ & 0x00000004) != 0)) {
          result.unk3300CKMNFOCNMGL_ = unk3300CKMNFOCNMGL_;
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
        if (other instanceof emu.grasscutter.net.proto.ChannelerSlabBuffSchemeInfoOuterClass.ChannelerSlabBuffSchemeInfo) {
          return mergeFrom((emu.grasscutter.net.proto.ChannelerSlabBuffSchemeInfoOuterClass.ChannelerSlabBuffSchemeInfo)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.ChannelerSlabBuffSchemeInfoOuterClass.ChannelerSlabBuffSchemeInfo other) {
        if (other == emu.grasscutter.net.proto.ChannelerSlabBuffSchemeInfoOuterClass.ChannelerSlabBuffSchemeInfo.getDefaultInstance()) return this;
        internalGetMutableSlotMap().mergeFrom(
            other.internalGetSlotMap());
        bitField0_ |= 0x00000001;
        if (other.getUnk3300NCMDDAFNENO() != 0) {
          setUnk3300NCMDDAFNENO(other.getUnk3300NCMDDAFNENO());
        }
        if (other.getUnk3300CKMNFOCNMGL() != 0) {
          setUnk3300CKMNFOCNMGL(other.getUnk3300CKMNFOCNMGL());
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
                unk3300NCMDDAFNENO_ = input.readUInt32();
                bitField0_ |= 0x00000002;
                break;
              } // case 8
              case 74: {
                com.google.protobuf.MapEntry<java.lang.Integer, java.lang.Integer>
                slotMap__ = input.readMessage(
                    SlotMapDefaultEntryHolder.defaultEntry.getParserForType(), extensionRegistry);
                internalGetMutableSlotMap().getMutableMap().put(
                    slotMap__.getKey(), slotMap__.getValue());
                bitField0_ |= 0x00000001;
                break;
              } // case 74
              case 80: {
                unk3300CKMNFOCNMGL_ = input.readUInt32();
                bitField0_ |= 0x00000004;
                break;
              } // case 80
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

      private com.google.protobuf.MapField<
          java.lang.Integer, java.lang.Integer> slotMap_;
      private com.google.protobuf.MapField<java.lang.Integer, java.lang.Integer>
          internalGetSlotMap() {
        if (slotMap_ == null) {
          return com.google.protobuf.MapField.emptyMapField(
              SlotMapDefaultEntryHolder.defaultEntry);
        }
        return slotMap_;
      }
      private com.google.protobuf.MapField<java.lang.Integer, java.lang.Integer>
          internalGetMutableSlotMap() {
        if (slotMap_ == null) {
          slotMap_ = com.google.protobuf.MapField.newMapField(
              SlotMapDefaultEntryHolder.defaultEntry);
        }
        if (!slotMap_.isMutable()) {
          slotMap_ = slotMap_.copy();
        }
        bitField0_ |= 0x00000001;
        onChanged();
        return slotMap_;
      }
      public int getSlotMapCount() {
        return internalGetSlotMap().getMap().size();
      }
      /**
       * <code>map&lt;uint32, uint32&gt; slotMap = 9;</code>
       */
      @java.lang.Override
      public boolean containsSlotMap(
          int key) {
        
        return internalGetSlotMap().getMap().containsKey(key);
      }
      /**
       * Use {@link #getSlotMapMap()} instead.
       */
      @java.lang.Override
      @java.lang.Deprecated
      public java.util.Map<java.lang.Integer, java.lang.Integer> getSlotMap() {
        return getSlotMapMap();
      }
      /**
       * <code>map&lt;uint32, uint32&gt; slotMap = 9;</code>
       */
      @java.lang.Override
      public java.util.Map<java.lang.Integer, java.lang.Integer> getSlotMapMap() {
        return internalGetSlotMap().getMap();
      }
      /**
       * <code>map&lt;uint32, uint32&gt; slotMap = 9;</code>
       */
      @java.lang.Override
      public int getSlotMapOrDefault(
          int key,
          int defaultValue) {
        
        java.util.Map<java.lang.Integer, java.lang.Integer> map =
            internalGetSlotMap().getMap();
        return map.containsKey(key) ? map.get(key) : defaultValue;
      }
      /**
       * <code>map&lt;uint32, uint32&gt; slotMap = 9;</code>
       */
      @java.lang.Override
      public int getSlotMapOrThrow(
          int key) {
        
        java.util.Map<java.lang.Integer, java.lang.Integer> map =
            internalGetSlotMap().getMap();
        if (!map.containsKey(key)) {
          throw new java.lang.IllegalArgumentException();
        }
        return map.get(key);
      }
      public Builder clearSlotMap() {
        bitField0_ = (bitField0_ & ~0x00000001);
        internalGetMutableSlotMap().getMutableMap()
            .clear();
        return this;
      }
      /**
       * <code>map&lt;uint32, uint32&gt; slotMap = 9;</code>
       */
      public Builder removeSlotMap(
          int key) {
        
        internalGetMutableSlotMap().getMutableMap()
            .remove(key);
        return this;
      }
      /**
       * Use alternate mutation accessors instead.
       */
      @java.lang.Deprecated
      public java.util.Map<java.lang.Integer, java.lang.Integer>
          getMutableSlotMap() {
        bitField0_ |= 0x00000001;
        return internalGetMutableSlotMap().getMutableMap();
      }
      /**
       * <code>map&lt;uint32, uint32&gt; slotMap = 9;</code>
       */
      public Builder putSlotMap(
          int key,
          int value) {
        
        
        internalGetMutableSlotMap().getMutableMap()
            .put(key, value);
        bitField0_ |= 0x00000001;
        return this;
      }
      /**
       * <code>map&lt;uint32, uint32&gt; slotMap = 9;</code>
       */
      public Builder putAllSlotMap(
          java.util.Map<java.lang.Integer, java.lang.Integer> values) {
        internalGetMutableSlotMap().getMutableMap()
            .putAll(values);
        bitField0_ |= 0x00000001;
        return this;
      }

      private int unk3300NCMDDAFNENO_ ;
      /**
       * <code>uint32 Unk3300_NCMDDAFNENO = 1;</code>
       * @return The unk3300NCMDDAFNENO.
       */
      @java.lang.Override
      public int getUnk3300NCMDDAFNENO() {
        return unk3300NCMDDAFNENO_;
      }
      /**
       * <code>uint32 Unk3300_NCMDDAFNENO = 1;</code>
       * @param value The unk3300NCMDDAFNENO to set.
       * @return This builder for chaining.
       */
      public Builder setUnk3300NCMDDAFNENO(int value) {
        
        unk3300NCMDDAFNENO_ = value;
        bitField0_ |= 0x00000002;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 Unk3300_NCMDDAFNENO = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearUnk3300NCMDDAFNENO() {
        bitField0_ = (bitField0_ & ~0x00000002);
        unk3300NCMDDAFNENO_ = 0;
        onChanged();
        return this;
      }

      private int unk3300CKMNFOCNMGL_ ;
      /**
       * <code>uint32 Unk3300_CKMNFOCNMGL = 10;</code>
       * @return The unk3300CKMNFOCNMGL.
       */
      @java.lang.Override
      public int getUnk3300CKMNFOCNMGL() {
        return unk3300CKMNFOCNMGL_;
      }
      /**
       * <code>uint32 Unk3300_CKMNFOCNMGL = 10;</code>
       * @param value The unk3300CKMNFOCNMGL to set.
       * @return This builder for chaining.
       */
      public Builder setUnk3300CKMNFOCNMGL(int value) {
        
        unk3300CKMNFOCNMGL_ = value;
        bitField0_ |= 0x00000004;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 Unk3300_CKMNFOCNMGL = 10;</code>
       * @return This builder for chaining.
       */
      public Builder clearUnk3300CKMNFOCNMGL() {
        bitField0_ = (bitField0_ & ~0x00000004);
        unk3300CKMNFOCNMGL_ = 0;
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


      // @@protoc_insertion_point(builder_scope:ChannelerSlabBuffSchemeInfo)
    }

    // @@protoc_insertion_point(class_scope:ChannelerSlabBuffSchemeInfo)
    private static final emu.grasscutter.net.proto.ChannelerSlabBuffSchemeInfoOuterClass.ChannelerSlabBuffSchemeInfo DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.ChannelerSlabBuffSchemeInfoOuterClass.ChannelerSlabBuffSchemeInfo();
    }

    public static emu.grasscutter.net.proto.ChannelerSlabBuffSchemeInfoOuterClass.ChannelerSlabBuffSchemeInfo getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<ChannelerSlabBuffSchemeInfo>
        PARSER = new com.google.protobuf.AbstractParser<ChannelerSlabBuffSchemeInfo>() {
      @java.lang.Override
      public ChannelerSlabBuffSchemeInfo parsePartialFrom(
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

    public static com.google.protobuf.Parser<ChannelerSlabBuffSchemeInfo> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<ChannelerSlabBuffSchemeInfo> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.ChannelerSlabBuffSchemeInfoOuterClass.ChannelerSlabBuffSchemeInfo getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_ChannelerSlabBuffSchemeInfo_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_ChannelerSlabBuffSchemeInfo_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_ChannelerSlabBuffSchemeInfo_SlotMapEntry_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_ChannelerSlabBuffSchemeInfo_SlotMapEntry_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n!ChannelerSlabBuffSchemeInfo.proto\"\303\001\n\033" +
      "ChannelerSlabBuffSchemeInfo\022:\n\007slotMap\030\t" +
      " \003(\0132).ChannelerSlabBuffSchemeInfo.SlotM" +
      "apEntry\022\033\n\023Unk3300_NCMDDAFNENO\030\001 \001(\r\022\033\n\023" +
      "Unk3300_CKMNFOCNMGL\030\n \001(\r\032.\n\014SlotMapEntr" +
      "y\022\013\n\003key\030\001 \001(\r\022\r\n\005value\030\002 \001(\r:\0028\001B\033\n\031emu" +
      ".grasscutter.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_ChannelerSlabBuffSchemeInfo_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_ChannelerSlabBuffSchemeInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_ChannelerSlabBuffSchemeInfo_descriptor,
        new java.lang.String[] { "SlotMap", "Unk3300NCMDDAFNENO", "Unk3300CKMNFOCNMGL", });
    internal_static_ChannelerSlabBuffSchemeInfo_SlotMapEntry_descriptor =
      internal_static_ChannelerSlabBuffSchemeInfo_descriptor.getNestedTypes().get(0);
    internal_static_ChannelerSlabBuffSchemeInfo_SlotMapEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_ChannelerSlabBuffSchemeInfo_SlotMapEntry_descriptor,
        new java.lang.String[] { "Key", "Value", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
