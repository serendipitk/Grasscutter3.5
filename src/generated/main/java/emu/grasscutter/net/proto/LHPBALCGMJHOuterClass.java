// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: LHPBALCGMJH.proto

package emu.grasscutter.net.proto;

public final class LHPBALCGMJHOuterClass {
  private LHPBALCGMJHOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface LHPBALCGMJHOrBuilder extends
      // @@protoc_insertion_point(interface_extends:LHPBALCGMJH)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>bool CCOOPAOKIGG = 8;</code>
     * @return The cCOOPAOKIGG.
     */
    boolean getCCOOPAOKIGG();
  }
  /**
   * <pre>
   * Name: LHPBALCGMJH
   * </pre>
   *
   * Protobuf type {@code LHPBALCGMJH}
   */
  public static final class LHPBALCGMJH extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:LHPBALCGMJH)
      LHPBALCGMJHOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use LHPBALCGMJH.newBuilder() to construct.
    private LHPBALCGMJH(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private LHPBALCGMJH() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new LHPBALCGMJH();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.LHPBALCGMJHOuterClass.internal_static_LHPBALCGMJH_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.LHPBALCGMJHOuterClass.internal_static_LHPBALCGMJH_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.LHPBALCGMJHOuterClass.LHPBALCGMJH.class, emu.grasscutter.net.proto.LHPBALCGMJHOuterClass.LHPBALCGMJH.Builder.class);
    }

    public static final int CCOOPAOKIGG_FIELD_NUMBER = 8;
    private boolean cCOOPAOKIGG_ = false;
    /**
     * <code>bool CCOOPAOKIGG = 8;</code>
     * @return The cCOOPAOKIGG.
     */
    @java.lang.Override
    public boolean getCCOOPAOKIGG() {
      return cCOOPAOKIGG_;
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
      if (cCOOPAOKIGG_ != false) {
        output.writeBool(8, cCOOPAOKIGG_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (cCOOPAOKIGG_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(8, cCOOPAOKIGG_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.LHPBALCGMJHOuterClass.LHPBALCGMJH)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.LHPBALCGMJHOuterClass.LHPBALCGMJH other = (emu.grasscutter.net.proto.LHPBALCGMJHOuterClass.LHPBALCGMJH) obj;

      if (getCCOOPAOKIGG()
          != other.getCCOOPAOKIGG()) return false;
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
      hash = (37 * hash) + CCOOPAOKIGG_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getCCOOPAOKIGG());
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.LHPBALCGMJHOuterClass.LHPBALCGMJH parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.LHPBALCGMJHOuterClass.LHPBALCGMJH parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.LHPBALCGMJHOuterClass.LHPBALCGMJH parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.LHPBALCGMJHOuterClass.LHPBALCGMJH parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.LHPBALCGMJHOuterClass.LHPBALCGMJH parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.LHPBALCGMJHOuterClass.LHPBALCGMJH parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.LHPBALCGMJHOuterClass.LHPBALCGMJH parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.LHPBALCGMJHOuterClass.LHPBALCGMJH parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.LHPBALCGMJHOuterClass.LHPBALCGMJH parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.LHPBALCGMJHOuterClass.LHPBALCGMJH parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.LHPBALCGMJHOuterClass.LHPBALCGMJH parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.LHPBALCGMJHOuterClass.LHPBALCGMJH parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.LHPBALCGMJHOuterClass.LHPBALCGMJH prototype) {
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
     * Name: LHPBALCGMJH
     * </pre>
     *
     * Protobuf type {@code LHPBALCGMJH}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:LHPBALCGMJH)
        emu.grasscutter.net.proto.LHPBALCGMJHOuterClass.LHPBALCGMJHOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.LHPBALCGMJHOuterClass.internal_static_LHPBALCGMJH_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.LHPBALCGMJHOuterClass.internal_static_LHPBALCGMJH_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.LHPBALCGMJHOuterClass.LHPBALCGMJH.class, emu.grasscutter.net.proto.LHPBALCGMJHOuterClass.LHPBALCGMJH.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.LHPBALCGMJHOuterClass.LHPBALCGMJH.newBuilder()
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
        cCOOPAOKIGG_ = false;
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.LHPBALCGMJHOuterClass.internal_static_LHPBALCGMJH_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.LHPBALCGMJHOuterClass.LHPBALCGMJH getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.LHPBALCGMJHOuterClass.LHPBALCGMJH.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.LHPBALCGMJHOuterClass.LHPBALCGMJH build() {
        emu.grasscutter.net.proto.LHPBALCGMJHOuterClass.LHPBALCGMJH result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.LHPBALCGMJHOuterClass.LHPBALCGMJH buildPartial() {
        emu.grasscutter.net.proto.LHPBALCGMJHOuterClass.LHPBALCGMJH result = new emu.grasscutter.net.proto.LHPBALCGMJHOuterClass.LHPBALCGMJH(this);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartial0(emu.grasscutter.net.proto.LHPBALCGMJHOuterClass.LHPBALCGMJH result) {
        int from_bitField0_ = bitField0_;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          result.cCOOPAOKIGG_ = cCOOPAOKIGG_;
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
        if (other instanceof emu.grasscutter.net.proto.LHPBALCGMJHOuterClass.LHPBALCGMJH) {
          return mergeFrom((emu.grasscutter.net.proto.LHPBALCGMJHOuterClass.LHPBALCGMJH)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.LHPBALCGMJHOuterClass.LHPBALCGMJH other) {
        if (other == emu.grasscutter.net.proto.LHPBALCGMJHOuterClass.LHPBALCGMJH.getDefaultInstance()) return this;
        if (other.getCCOOPAOKIGG() != false) {
          setCCOOPAOKIGG(other.getCCOOPAOKIGG());
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
              case 64: {
                cCOOPAOKIGG_ = input.readBool();
                bitField0_ |= 0x00000001;
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

      private boolean cCOOPAOKIGG_ ;
      /**
       * <code>bool CCOOPAOKIGG = 8;</code>
       * @return The cCOOPAOKIGG.
       */
      @java.lang.Override
      public boolean getCCOOPAOKIGG() {
        return cCOOPAOKIGG_;
      }
      /**
       * <code>bool CCOOPAOKIGG = 8;</code>
       * @param value The cCOOPAOKIGG to set.
       * @return This builder for chaining.
       */
      public Builder setCCOOPAOKIGG(boolean value) {
        
        cCOOPAOKIGG_ = value;
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>bool CCOOPAOKIGG = 8;</code>
       * @return This builder for chaining.
       */
      public Builder clearCCOOPAOKIGG() {
        bitField0_ = (bitField0_ & ~0x00000001);
        cCOOPAOKIGG_ = false;
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


      // @@protoc_insertion_point(builder_scope:LHPBALCGMJH)
    }

    // @@protoc_insertion_point(class_scope:LHPBALCGMJH)
    private static final emu.grasscutter.net.proto.LHPBALCGMJHOuterClass.LHPBALCGMJH DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.LHPBALCGMJHOuterClass.LHPBALCGMJH();
    }

    public static emu.grasscutter.net.proto.LHPBALCGMJHOuterClass.LHPBALCGMJH getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<LHPBALCGMJH>
        PARSER = new com.google.protobuf.AbstractParser<LHPBALCGMJH>() {
      @java.lang.Override
      public LHPBALCGMJH parsePartialFrom(
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

    public static com.google.protobuf.Parser<LHPBALCGMJH> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<LHPBALCGMJH> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.LHPBALCGMJHOuterClass.LHPBALCGMJH getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_LHPBALCGMJH_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_LHPBALCGMJH_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\021LHPBALCGMJH.proto\"\"\n\013LHPBALCGMJH\022\023\n\013CC" +
      "OOPAOKIGG\030\010 \001(\010B\033\n\031emu.grasscutter.net.p" +
      "rotob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_LHPBALCGMJH_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_LHPBALCGMJH_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_LHPBALCGMJH_descriptor,
        new java.lang.String[] { "CCOOPAOKIGG", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
