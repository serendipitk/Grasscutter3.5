// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: CoinCollectInfo.proto

package emu.grasscutter.net.proto;

public final class CoinCollectInfoOuterClass {
  private CoinCollectInfoOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface CoinCollectInfoOrBuilder extends
      // @@protoc_insertion_point(interface_extends:CoinCollectInfo)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 Unk3300_CPLDPCMBHOE = 11;</code>
     * @return The unk3300CPLDPCMBHOE.
     */
    int getUnk3300CPLDPCMBHOE();

    /**
     * <code>uint32 Unk3300_DKBJMLJGLIB = 9;</code>
     * @return The unk3300DKBJMLJGLIB.
     */
    int getUnk3300DKBJMLJGLIB();
  }
  /**
   * Protobuf type {@code CoinCollectInfo}
   */
  public static final class CoinCollectInfo extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:CoinCollectInfo)
      CoinCollectInfoOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use CoinCollectInfo.newBuilder() to construct.
    private CoinCollectInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private CoinCollectInfo() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new CoinCollectInfo();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.CoinCollectInfoOuterClass.internal_static_CoinCollectInfo_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.CoinCollectInfoOuterClass.internal_static_CoinCollectInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.CoinCollectInfoOuterClass.CoinCollectInfo.class, emu.grasscutter.net.proto.CoinCollectInfoOuterClass.CoinCollectInfo.Builder.class);
    }

    public static final int UNK3300_CPLDPCMBHOE_FIELD_NUMBER = 11;
    private int unk3300CPLDPCMBHOE_ = 0;
    /**
     * <code>uint32 Unk3300_CPLDPCMBHOE = 11;</code>
     * @return The unk3300CPLDPCMBHOE.
     */
    @java.lang.Override
    public int getUnk3300CPLDPCMBHOE() {
      return unk3300CPLDPCMBHOE_;
    }

    public static final int UNK3300_DKBJMLJGLIB_FIELD_NUMBER = 9;
    private int unk3300DKBJMLJGLIB_ = 0;
    /**
     * <code>uint32 Unk3300_DKBJMLJGLIB = 9;</code>
     * @return The unk3300DKBJMLJGLIB.
     */
    @java.lang.Override
    public int getUnk3300DKBJMLJGLIB() {
      return unk3300DKBJMLJGLIB_;
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
      if (unk3300DKBJMLJGLIB_ != 0) {
        output.writeUInt32(9, unk3300DKBJMLJGLIB_);
      }
      if (unk3300CPLDPCMBHOE_ != 0) {
        output.writeUInt32(11, unk3300CPLDPCMBHOE_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (unk3300DKBJMLJGLIB_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(9, unk3300DKBJMLJGLIB_);
      }
      if (unk3300CPLDPCMBHOE_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(11, unk3300CPLDPCMBHOE_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.CoinCollectInfoOuterClass.CoinCollectInfo)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.CoinCollectInfoOuterClass.CoinCollectInfo other = (emu.grasscutter.net.proto.CoinCollectInfoOuterClass.CoinCollectInfo) obj;

      if (getUnk3300CPLDPCMBHOE()
          != other.getUnk3300CPLDPCMBHOE()) return false;
      if (getUnk3300DKBJMLJGLIB()
          != other.getUnk3300DKBJMLJGLIB()) return false;
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
      hash = (37 * hash) + UNK3300_CPLDPCMBHOE_FIELD_NUMBER;
      hash = (53 * hash) + getUnk3300CPLDPCMBHOE();
      hash = (37 * hash) + UNK3300_DKBJMLJGLIB_FIELD_NUMBER;
      hash = (53 * hash) + getUnk3300DKBJMLJGLIB();
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.CoinCollectInfoOuterClass.CoinCollectInfo parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.CoinCollectInfoOuterClass.CoinCollectInfo parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.CoinCollectInfoOuterClass.CoinCollectInfo parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.CoinCollectInfoOuterClass.CoinCollectInfo parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.CoinCollectInfoOuterClass.CoinCollectInfo parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.CoinCollectInfoOuterClass.CoinCollectInfo parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.CoinCollectInfoOuterClass.CoinCollectInfo parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.CoinCollectInfoOuterClass.CoinCollectInfo parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.CoinCollectInfoOuterClass.CoinCollectInfo parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.CoinCollectInfoOuterClass.CoinCollectInfo parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.CoinCollectInfoOuterClass.CoinCollectInfo parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.CoinCollectInfoOuterClass.CoinCollectInfo parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.CoinCollectInfoOuterClass.CoinCollectInfo prototype) {
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
     * Protobuf type {@code CoinCollectInfo}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:CoinCollectInfo)
        emu.grasscutter.net.proto.CoinCollectInfoOuterClass.CoinCollectInfoOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.CoinCollectInfoOuterClass.internal_static_CoinCollectInfo_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.CoinCollectInfoOuterClass.internal_static_CoinCollectInfo_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.CoinCollectInfoOuterClass.CoinCollectInfo.class, emu.grasscutter.net.proto.CoinCollectInfoOuterClass.CoinCollectInfo.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.CoinCollectInfoOuterClass.CoinCollectInfo.newBuilder()
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
        unk3300CPLDPCMBHOE_ = 0;
        unk3300DKBJMLJGLIB_ = 0;
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.CoinCollectInfoOuterClass.internal_static_CoinCollectInfo_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.CoinCollectInfoOuterClass.CoinCollectInfo getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.CoinCollectInfoOuterClass.CoinCollectInfo.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.CoinCollectInfoOuterClass.CoinCollectInfo build() {
        emu.grasscutter.net.proto.CoinCollectInfoOuterClass.CoinCollectInfo result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.CoinCollectInfoOuterClass.CoinCollectInfo buildPartial() {
        emu.grasscutter.net.proto.CoinCollectInfoOuterClass.CoinCollectInfo result = new emu.grasscutter.net.proto.CoinCollectInfoOuterClass.CoinCollectInfo(this);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartial0(emu.grasscutter.net.proto.CoinCollectInfoOuterClass.CoinCollectInfo result) {
        int from_bitField0_ = bitField0_;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          result.unk3300CPLDPCMBHOE_ = unk3300CPLDPCMBHOE_;
        }
        if (((from_bitField0_ & 0x00000002) != 0)) {
          result.unk3300DKBJMLJGLIB_ = unk3300DKBJMLJGLIB_;
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
        if (other instanceof emu.grasscutter.net.proto.CoinCollectInfoOuterClass.CoinCollectInfo) {
          return mergeFrom((emu.grasscutter.net.proto.CoinCollectInfoOuterClass.CoinCollectInfo)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.CoinCollectInfoOuterClass.CoinCollectInfo other) {
        if (other == emu.grasscutter.net.proto.CoinCollectInfoOuterClass.CoinCollectInfo.getDefaultInstance()) return this;
        if (other.getUnk3300CPLDPCMBHOE() != 0) {
          setUnk3300CPLDPCMBHOE(other.getUnk3300CPLDPCMBHOE());
        }
        if (other.getUnk3300DKBJMLJGLIB() != 0) {
          setUnk3300DKBJMLJGLIB(other.getUnk3300DKBJMLJGLIB());
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
              case 72: {
                unk3300DKBJMLJGLIB_ = input.readUInt32();
                bitField0_ |= 0x00000002;
                break;
              } // case 72
              case 88: {
                unk3300CPLDPCMBHOE_ = input.readUInt32();
                bitField0_ |= 0x00000001;
                break;
              } // case 88
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

      private int unk3300CPLDPCMBHOE_ ;
      /**
       * <code>uint32 Unk3300_CPLDPCMBHOE = 11;</code>
       * @return The unk3300CPLDPCMBHOE.
       */
      @java.lang.Override
      public int getUnk3300CPLDPCMBHOE() {
        return unk3300CPLDPCMBHOE_;
      }
      /**
       * <code>uint32 Unk3300_CPLDPCMBHOE = 11;</code>
       * @param value The unk3300CPLDPCMBHOE to set.
       * @return This builder for chaining.
       */
      public Builder setUnk3300CPLDPCMBHOE(int value) {
        
        unk3300CPLDPCMBHOE_ = value;
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 Unk3300_CPLDPCMBHOE = 11;</code>
       * @return This builder for chaining.
       */
      public Builder clearUnk3300CPLDPCMBHOE() {
        bitField0_ = (bitField0_ & ~0x00000001);
        unk3300CPLDPCMBHOE_ = 0;
        onChanged();
        return this;
      }

      private int unk3300DKBJMLJGLIB_ ;
      /**
       * <code>uint32 Unk3300_DKBJMLJGLIB = 9;</code>
       * @return The unk3300DKBJMLJGLIB.
       */
      @java.lang.Override
      public int getUnk3300DKBJMLJGLIB() {
        return unk3300DKBJMLJGLIB_;
      }
      /**
       * <code>uint32 Unk3300_DKBJMLJGLIB = 9;</code>
       * @param value The unk3300DKBJMLJGLIB to set.
       * @return This builder for chaining.
       */
      public Builder setUnk3300DKBJMLJGLIB(int value) {
        
        unk3300DKBJMLJGLIB_ = value;
        bitField0_ |= 0x00000002;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 Unk3300_DKBJMLJGLIB = 9;</code>
       * @return This builder for chaining.
       */
      public Builder clearUnk3300DKBJMLJGLIB() {
        bitField0_ = (bitField0_ & ~0x00000002);
        unk3300DKBJMLJGLIB_ = 0;
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


      // @@protoc_insertion_point(builder_scope:CoinCollectInfo)
    }

    // @@protoc_insertion_point(class_scope:CoinCollectInfo)
    private static final emu.grasscutter.net.proto.CoinCollectInfoOuterClass.CoinCollectInfo DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.CoinCollectInfoOuterClass.CoinCollectInfo();
    }

    public static emu.grasscutter.net.proto.CoinCollectInfoOuterClass.CoinCollectInfo getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<CoinCollectInfo>
        PARSER = new com.google.protobuf.AbstractParser<CoinCollectInfo>() {
      @java.lang.Override
      public CoinCollectInfo parsePartialFrom(
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

    public static com.google.protobuf.Parser<CoinCollectInfo> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<CoinCollectInfo> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.CoinCollectInfoOuterClass.CoinCollectInfo getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_CoinCollectInfo_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_CoinCollectInfo_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\025CoinCollectInfo.proto\"K\n\017CoinCollectIn" +
      "fo\022\033\n\023Unk3300_CPLDPCMBHOE\030\013 \001(\r\022\033\n\023Unk33" +
      "00_DKBJMLJGLIB\030\t \001(\rB\033\n\031emu.grasscutter." +
      "net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_CoinCollectInfo_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_CoinCollectInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_CoinCollectInfo_descriptor,
        new java.lang.String[] { "Unk3300CPLDPCMBHOE", "Unk3300DKBJMLJGLIB", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
