// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: OLAHPIKKKOM.proto

package emu.grasscutter.net.proto;

public final class OLAHPIKKKOMOuterClass {
  private OLAHPIKKKOMOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface OLAHPIKKKOMOrBuilder extends
      // @@protoc_insertion_point(interface_extends:OLAHPIKKKOM)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>float IHKHEPAGNFD = 1;</code>
     * @return The iHKHEPAGNFD.
     */
    float getIHKHEPAGNFD();

    /**
     * <code>bool ABCENJAFGOF = 2;</code>
     * @return The aBCENJAFGOF.
     */
    boolean getABCENJAFGOF();

    /**
     * <code>uint32 fungus_id = 8;</code>
     * @return The fungusId.
     */
    int getFungusId();
  }
  /**
   * <pre>
   * Name: OLAHPIKKKOM
   * </pre>
   *
   * Protobuf type {@code OLAHPIKKKOM}
   */
  public static final class OLAHPIKKKOM extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:OLAHPIKKKOM)
      OLAHPIKKKOMOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use OLAHPIKKKOM.newBuilder() to construct.
    private OLAHPIKKKOM(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private OLAHPIKKKOM() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new OLAHPIKKKOM();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.OLAHPIKKKOMOuterClass.internal_static_OLAHPIKKKOM_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.OLAHPIKKKOMOuterClass.internal_static_OLAHPIKKKOM_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.OLAHPIKKKOMOuterClass.OLAHPIKKKOM.class, emu.grasscutter.net.proto.OLAHPIKKKOMOuterClass.OLAHPIKKKOM.Builder.class);
    }

    public static final int IHKHEPAGNFD_FIELD_NUMBER = 1;
    private float iHKHEPAGNFD_ = 0F;
    /**
     * <code>float IHKHEPAGNFD = 1;</code>
     * @return The iHKHEPAGNFD.
     */
    @java.lang.Override
    public float getIHKHEPAGNFD() {
      return iHKHEPAGNFD_;
    }

    public static final int ABCENJAFGOF_FIELD_NUMBER = 2;
    private boolean aBCENJAFGOF_ = false;
    /**
     * <code>bool ABCENJAFGOF = 2;</code>
     * @return The aBCENJAFGOF.
     */
    @java.lang.Override
    public boolean getABCENJAFGOF() {
      return aBCENJAFGOF_;
    }

    public static final int FUNGUS_ID_FIELD_NUMBER = 8;
    private int fungusId_ = 0;
    /**
     * <code>uint32 fungus_id = 8;</code>
     * @return The fungusId.
     */
    @java.lang.Override
    public int getFungusId() {
      return fungusId_;
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
      if (java.lang.Float.floatToRawIntBits(iHKHEPAGNFD_) != 0) {
        output.writeFloat(1, iHKHEPAGNFD_);
      }
      if (aBCENJAFGOF_ != false) {
        output.writeBool(2, aBCENJAFGOF_);
      }
      if (fungusId_ != 0) {
        output.writeUInt32(8, fungusId_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (java.lang.Float.floatToRawIntBits(iHKHEPAGNFD_) != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeFloatSize(1, iHKHEPAGNFD_);
      }
      if (aBCENJAFGOF_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(2, aBCENJAFGOF_);
      }
      if (fungusId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(8, fungusId_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.OLAHPIKKKOMOuterClass.OLAHPIKKKOM)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.OLAHPIKKKOMOuterClass.OLAHPIKKKOM other = (emu.grasscutter.net.proto.OLAHPIKKKOMOuterClass.OLAHPIKKKOM) obj;

      if (java.lang.Float.floatToIntBits(getIHKHEPAGNFD())
          != java.lang.Float.floatToIntBits(
              other.getIHKHEPAGNFD())) return false;
      if (getABCENJAFGOF()
          != other.getABCENJAFGOF()) return false;
      if (getFungusId()
          != other.getFungusId()) return false;
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
      hash = (37 * hash) + IHKHEPAGNFD_FIELD_NUMBER;
      hash = (53 * hash) + java.lang.Float.floatToIntBits(
          getIHKHEPAGNFD());
      hash = (37 * hash) + ABCENJAFGOF_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getABCENJAFGOF());
      hash = (37 * hash) + FUNGUS_ID_FIELD_NUMBER;
      hash = (53 * hash) + getFungusId();
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.OLAHPIKKKOMOuterClass.OLAHPIKKKOM parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.OLAHPIKKKOMOuterClass.OLAHPIKKKOM parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.OLAHPIKKKOMOuterClass.OLAHPIKKKOM parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.OLAHPIKKKOMOuterClass.OLAHPIKKKOM parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.OLAHPIKKKOMOuterClass.OLAHPIKKKOM parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.OLAHPIKKKOMOuterClass.OLAHPIKKKOM parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.OLAHPIKKKOMOuterClass.OLAHPIKKKOM parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.OLAHPIKKKOMOuterClass.OLAHPIKKKOM parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.OLAHPIKKKOMOuterClass.OLAHPIKKKOM parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.OLAHPIKKKOMOuterClass.OLAHPIKKKOM parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.OLAHPIKKKOMOuterClass.OLAHPIKKKOM parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.OLAHPIKKKOMOuterClass.OLAHPIKKKOM parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.OLAHPIKKKOMOuterClass.OLAHPIKKKOM prototype) {
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
     * <pre>
     * Name: OLAHPIKKKOM
     * </pre>
     *
     * Protobuf type {@code OLAHPIKKKOM}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:OLAHPIKKKOM)
        emu.grasscutter.net.proto.OLAHPIKKKOMOuterClass.OLAHPIKKKOMOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.OLAHPIKKKOMOuterClass.internal_static_OLAHPIKKKOM_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.OLAHPIKKKOMOuterClass.internal_static_OLAHPIKKKOM_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.OLAHPIKKKOMOuterClass.OLAHPIKKKOM.class, emu.grasscutter.net.proto.OLAHPIKKKOMOuterClass.OLAHPIKKKOM.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.OLAHPIKKKOMOuterClass.OLAHPIKKKOM.newBuilder()
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
        iHKHEPAGNFD_ = 0F;
        aBCENJAFGOF_ = false;
        fungusId_ = 0;
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.OLAHPIKKKOMOuterClass.internal_static_OLAHPIKKKOM_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.OLAHPIKKKOMOuterClass.OLAHPIKKKOM getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.OLAHPIKKKOMOuterClass.OLAHPIKKKOM.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.OLAHPIKKKOMOuterClass.OLAHPIKKKOM build() {
        emu.grasscutter.net.proto.OLAHPIKKKOMOuterClass.OLAHPIKKKOM result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.OLAHPIKKKOMOuterClass.OLAHPIKKKOM buildPartial() {
        emu.grasscutter.net.proto.OLAHPIKKKOMOuterClass.OLAHPIKKKOM result = new emu.grasscutter.net.proto.OLAHPIKKKOMOuterClass.OLAHPIKKKOM(this);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartial0(emu.grasscutter.net.proto.OLAHPIKKKOMOuterClass.OLAHPIKKKOM result) {
        int from_bitField0_ = bitField0_;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          result.iHKHEPAGNFD_ = iHKHEPAGNFD_;
        }
        if (((from_bitField0_ & 0x00000002) != 0)) {
          result.aBCENJAFGOF_ = aBCENJAFGOF_;
        }
        if (((from_bitField0_ & 0x00000004) != 0)) {
          result.fungusId_ = fungusId_;
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
        if (other instanceof emu.grasscutter.net.proto.OLAHPIKKKOMOuterClass.OLAHPIKKKOM) {
          return mergeFrom((emu.grasscutter.net.proto.OLAHPIKKKOMOuterClass.OLAHPIKKKOM)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.OLAHPIKKKOMOuterClass.OLAHPIKKKOM other) {
        if (other == emu.grasscutter.net.proto.OLAHPIKKKOMOuterClass.OLAHPIKKKOM.getDefaultInstance()) return this;
        if (other.getIHKHEPAGNFD() != 0F) {
          setIHKHEPAGNFD(other.getIHKHEPAGNFD());
        }
        if (other.getABCENJAFGOF() != false) {
          setABCENJAFGOF(other.getABCENJAFGOF());
        }
        if (other.getFungusId() != 0) {
          setFungusId(other.getFungusId());
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
              case 13: {
                iHKHEPAGNFD_ = input.readFloat();
                bitField0_ |= 0x00000001;
                break;
              } // case 13
              case 16: {
                aBCENJAFGOF_ = input.readBool();
                bitField0_ |= 0x00000002;
                break;
              } // case 16
              case 64: {
                fungusId_ = input.readUInt32();
                bitField0_ |= 0x00000004;
                break;
              } // case 64
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

      private float iHKHEPAGNFD_ ;
      /**
       * <code>float IHKHEPAGNFD = 1;</code>
       * @return The iHKHEPAGNFD.
       */
      @java.lang.Override
      public float getIHKHEPAGNFD() {
        return iHKHEPAGNFD_;
      }
      /**
       * <code>float IHKHEPAGNFD = 1;</code>
       * @param value The iHKHEPAGNFD to set.
       * @return This builder for chaining.
       */
      public Builder setIHKHEPAGNFD(float value) {
        
        iHKHEPAGNFD_ = value;
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>float IHKHEPAGNFD = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearIHKHEPAGNFD() {
        bitField0_ = (bitField0_ & ~0x00000001);
        iHKHEPAGNFD_ = 0F;
        onChanged();
        return this;
      }

      private boolean aBCENJAFGOF_ ;
      /**
       * <code>bool ABCENJAFGOF = 2;</code>
       * @return The aBCENJAFGOF.
       */
      @java.lang.Override
      public boolean getABCENJAFGOF() {
        return aBCENJAFGOF_;
      }
      /**
       * <code>bool ABCENJAFGOF = 2;</code>
       * @param value The aBCENJAFGOF to set.
       * @return This builder for chaining.
       */
      public Builder setABCENJAFGOF(boolean value) {
        
        aBCENJAFGOF_ = value;
        bitField0_ |= 0x00000002;
        onChanged();
        return this;
      }
      /**
       * <code>bool ABCENJAFGOF = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearABCENJAFGOF() {
        bitField0_ = (bitField0_ & ~0x00000002);
        aBCENJAFGOF_ = false;
        onChanged();
        return this;
      }

      private int fungusId_ ;
      /**
       * <code>uint32 fungus_id = 8;</code>
       * @return The fungusId.
       */
      @java.lang.Override
      public int getFungusId() {
        return fungusId_;
      }
      /**
       * <code>uint32 fungus_id = 8;</code>
       * @param value The fungusId to set.
       * @return This builder for chaining.
       */
      public Builder setFungusId(int value) {
        
        fungusId_ = value;
        bitField0_ |= 0x00000004;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 fungus_id = 8;</code>
       * @return This builder for chaining.
       */
      public Builder clearFungusId() {
        bitField0_ = (bitField0_ & ~0x00000004);
        fungusId_ = 0;
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


      // @@protoc_insertion_point(builder_scope:OLAHPIKKKOM)
    }

    // @@protoc_insertion_point(class_scope:OLAHPIKKKOM)
    private static final emu.grasscutter.net.proto.OLAHPIKKKOMOuterClass.OLAHPIKKKOM DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.OLAHPIKKKOMOuterClass.OLAHPIKKKOM();
    }

    public static emu.grasscutter.net.proto.OLAHPIKKKOMOuterClass.OLAHPIKKKOM getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<OLAHPIKKKOM>
        PARSER = new com.google.protobuf.AbstractParser<OLAHPIKKKOM>() {
      @java.lang.Override
      public OLAHPIKKKOM parsePartialFrom(
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

    public static com.google.protobuf.Parser<OLAHPIKKKOM> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<OLAHPIKKKOM> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.OLAHPIKKKOMOuterClass.OLAHPIKKKOM getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_OLAHPIKKKOM_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_OLAHPIKKKOM_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\021OLAHPIKKKOM.proto\"J\n\013OLAHPIKKKOM\022\023\n\013IH" +
      "KHEPAGNFD\030\001 \001(\002\022\023\n\013ABCENJAFGOF\030\002 \001(\010\022\021\n\t" +
      "fungus_id\030\010 \001(\rB\033\n\031emu.grasscutter.net.p" +
      "rotob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_OLAHPIKKKOM_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_OLAHPIKKKOM_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_OLAHPIKKKOM_descriptor,
        new java.lang.String[] { "IHKHEPAGNFD", "ABCENJAFGOF", "FungusId", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
