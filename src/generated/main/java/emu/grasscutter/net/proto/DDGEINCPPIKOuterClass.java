// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: DDGEINCPPIK.proto

package emu.grasscutter.net.proto;

public final class DDGEINCPPIKOuterClass {
  private DDGEINCPPIKOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface DDGEINCPPIKOrBuilder extends
      // @@protoc_insertion_point(interface_extends:DDGEINCPPIK)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 state = 1;</code>
     * @return The state.
     */
    int getState();

    /**
     * <code>uint32 LLNJKILEEBC = 14;</code>
     * @return The lLNJKILEEBC.
     */
    int getLLNJKILEEBC();

    /**
     * <code>uint32 quest_id = 8;</code>
     * @return The questId.
     */
    int getQuestId();
  }
  /**
   * <pre>
   * Name: DDGEINCPPIK
   * </pre>
   *
   * Protobuf type {@code DDGEINCPPIK}
   */
  public static final class DDGEINCPPIK extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:DDGEINCPPIK)
      DDGEINCPPIKOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use DDGEINCPPIK.newBuilder() to construct.
    private DDGEINCPPIK(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private DDGEINCPPIK() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new DDGEINCPPIK();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.DDGEINCPPIKOuterClass.internal_static_DDGEINCPPIK_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.DDGEINCPPIKOuterClass.internal_static_DDGEINCPPIK_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.DDGEINCPPIKOuterClass.DDGEINCPPIK.class, emu.grasscutter.net.proto.DDGEINCPPIKOuterClass.DDGEINCPPIK.Builder.class);
    }

    public static final int STATE_FIELD_NUMBER = 1;
    private int state_ = 0;
    /**
     * <code>uint32 state = 1;</code>
     * @return The state.
     */
    @java.lang.Override
    public int getState() {
      return state_;
    }

    public static final int LLNJKILEEBC_FIELD_NUMBER = 14;
    private int lLNJKILEEBC_ = 0;
    /**
     * <code>uint32 LLNJKILEEBC = 14;</code>
     * @return The lLNJKILEEBC.
     */
    @java.lang.Override
    public int getLLNJKILEEBC() {
      return lLNJKILEEBC_;
    }

    public static final int QUEST_ID_FIELD_NUMBER = 8;
    private int questId_ = 0;
    /**
     * <code>uint32 quest_id = 8;</code>
     * @return The questId.
     */
    @java.lang.Override
    public int getQuestId() {
      return questId_;
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
      if (state_ != 0) {
        output.writeUInt32(1, state_);
      }
      if (questId_ != 0) {
        output.writeUInt32(8, questId_);
      }
      if (lLNJKILEEBC_ != 0) {
        output.writeUInt32(14, lLNJKILEEBC_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (state_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(1, state_);
      }
      if (questId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(8, questId_);
      }
      if (lLNJKILEEBC_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(14, lLNJKILEEBC_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.DDGEINCPPIKOuterClass.DDGEINCPPIK)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.DDGEINCPPIKOuterClass.DDGEINCPPIK other = (emu.grasscutter.net.proto.DDGEINCPPIKOuterClass.DDGEINCPPIK) obj;

      if (getState()
          != other.getState()) return false;
      if (getLLNJKILEEBC()
          != other.getLLNJKILEEBC()) return false;
      if (getQuestId()
          != other.getQuestId()) return false;
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
      hash = (37 * hash) + STATE_FIELD_NUMBER;
      hash = (53 * hash) + getState();
      hash = (37 * hash) + LLNJKILEEBC_FIELD_NUMBER;
      hash = (53 * hash) + getLLNJKILEEBC();
      hash = (37 * hash) + QUEST_ID_FIELD_NUMBER;
      hash = (53 * hash) + getQuestId();
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.DDGEINCPPIKOuterClass.DDGEINCPPIK parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.DDGEINCPPIKOuterClass.DDGEINCPPIK parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.DDGEINCPPIKOuterClass.DDGEINCPPIK parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.DDGEINCPPIKOuterClass.DDGEINCPPIK parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.DDGEINCPPIKOuterClass.DDGEINCPPIK parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.DDGEINCPPIKOuterClass.DDGEINCPPIK parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.DDGEINCPPIKOuterClass.DDGEINCPPIK parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.DDGEINCPPIKOuterClass.DDGEINCPPIK parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.DDGEINCPPIKOuterClass.DDGEINCPPIK parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.DDGEINCPPIKOuterClass.DDGEINCPPIK parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.DDGEINCPPIKOuterClass.DDGEINCPPIK parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.DDGEINCPPIKOuterClass.DDGEINCPPIK parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.DDGEINCPPIKOuterClass.DDGEINCPPIK prototype) {
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
     * Name: DDGEINCPPIK
     * </pre>
     *
     * Protobuf type {@code DDGEINCPPIK}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:DDGEINCPPIK)
        emu.grasscutter.net.proto.DDGEINCPPIKOuterClass.DDGEINCPPIKOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.DDGEINCPPIKOuterClass.internal_static_DDGEINCPPIK_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.DDGEINCPPIKOuterClass.internal_static_DDGEINCPPIK_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.DDGEINCPPIKOuterClass.DDGEINCPPIK.class, emu.grasscutter.net.proto.DDGEINCPPIKOuterClass.DDGEINCPPIK.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.DDGEINCPPIKOuterClass.DDGEINCPPIK.newBuilder()
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
        state_ = 0;
        lLNJKILEEBC_ = 0;
        questId_ = 0;
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.DDGEINCPPIKOuterClass.internal_static_DDGEINCPPIK_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.DDGEINCPPIKOuterClass.DDGEINCPPIK getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.DDGEINCPPIKOuterClass.DDGEINCPPIK.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.DDGEINCPPIKOuterClass.DDGEINCPPIK build() {
        emu.grasscutter.net.proto.DDGEINCPPIKOuterClass.DDGEINCPPIK result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.DDGEINCPPIKOuterClass.DDGEINCPPIK buildPartial() {
        emu.grasscutter.net.proto.DDGEINCPPIKOuterClass.DDGEINCPPIK result = new emu.grasscutter.net.proto.DDGEINCPPIKOuterClass.DDGEINCPPIK(this);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartial0(emu.grasscutter.net.proto.DDGEINCPPIKOuterClass.DDGEINCPPIK result) {
        int from_bitField0_ = bitField0_;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          result.state_ = state_;
        }
        if (((from_bitField0_ & 0x00000002) != 0)) {
          result.lLNJKILEEBC_ = lLNJKILEEBC_;
        }
        if (((from_bitField0_ & 0x00000004) != 0)) {
          result.questId_ = questId_;
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
        if (other instanceof emu.grasscutter.net.proto.DDGEINCPPIKOuterClass.DDGEINCPPIK) {
          return mergeFrom((emu.grasscutter.net.proto.DDGEINCPPIKOuterClass.DDGEINCPPIK)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.DDGEINCPPIKOuterClass.DDGEINCPPIK other) {
        if (other == emu.grasscutter.net.proto.DDGEINCPPIKOuterClass.DDGEINCPPIK.getDefaultInstance()) return this;
        if (other.getState() != 0) {
          setState(other.getState());
        }
        if (other.getLLNJKILEEBC() != 0) {
          setLLNJKILEEBC(other.getLLNJKILEEBC());
        }
        if (other.getQuestId() != 0) {
          setQuestId(other.getQuestId());
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
                state_ = input.readUInt32();
                bitField0_ |= 0x00000001;
                break;
              } // case 8
              case 64: {
                questId_ = input.readUInt32();
                bitField0_ |= 0x00000004;
                break;
              } // case 64
              case 112: {
                lLNJKILEEBC_ = input.readUInt32();
                bitField0_ |= 0x00000002;
                break;
              } // case 112
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

      private int state_ ;
      /**
       * <code>uint32 state = 1;</code>
       * @return The state.
       */
      @java.lang.Override
      public int getState() {
        return state_;
      }
      /**
       * <code>uint32 state = 1;</code>
       * @param value The state to set.
       * @return This builder for chaining.
       */
      public Builder setState(int value) {
        
        state_ = value;
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 state = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearState() {
        bitField0_ = (bitField0_ & ~0x00000001);
        state_ = 0;
        onChanged();
        return this;
      }

      private int lLNJKILEEBC_ ;
      /**
       * <code>uint32 LLNJKILEEBC = 14;</code>
       * @return The lLNJKILEEBC.
       */
      @java.lang.Override
      public int getLLNJKILEEBC() {
        return lLNJKILEEBC_;
      }
      /**
       * <code>uint32 LLNJKILEEBC = 14;</code>
       * @param value The lLNJKILEEBC to set.
       * @return This builder for chaining.
       */
      public Builder setLLNJKILEEBC(int value) {
        
        lLNJKILEEBC_ = value;
        bitField0_ |= 0x00000002;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 LLNJKILEEBC = 14;</code>
       * @return This builder for chaining.
       */
      public Builder clearLLNJKILEEBC() {
        bitField0_ = (bitField0_ & ~0x00000002);
        lLNJKILEEBC_ = 0;
        onChanged();
        return this;
      }

      private int questId_ ;
      /**
       * <code>uint32 quest_id = 8;</code>
       * @return The questId.
       */
      @java.lang.Override
      public int getQuestId() {
        return questId_;
      }
      /**
       * <code>uint32 quest_id = 8;</code>
       * @param value The questId to set.
       * @return This builder for chaining.
       */
      public Builder setQuestId(int value) {
        
        questId_ = value;
        bitField0_ |= 0x00000004;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 quest_id = 8;</code>
       * @return This builder for chaining.
       */
      public Builder clearQuestId() {
        bitField0_ = (bitField0_ & ~0x00000004);
        questId_ = 0;
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


      // @@protoc_insertion_point(builder_scope:DDGEINCPPIK)
    }

    // @@protoc_insertion_point(class_scope:DDGEINCPPIK)
    private static final emu.grasscutter.net.proto.DDGEINCPPIKOuterClass.DDGEINCPPIK DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.DDGEINCPPIKOuterClass.DDGEINCPPIK();
    }

    public static emu.grasscutter.net.proto.DDGEINCPPIKOuterClass.DDGEINCPPIK getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<DDGEINCPPIK>
        PARSER = new com.google.protobuf.AbstractParser<DDGEINCPPIK>() {
      @java.lang.Override
      public DDGEINCPPIK parsePartialFrom(
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

    public static com.google.protobuf.Parser<DDGEINCPPIK> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<DDGEINCPPIK> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.DDGEINCPPIKOuterClass.DDGEINCPPIK getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_DDGEINCPPIK_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_DDGEINCPPIK_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\021DDGEINCPPIK.proto\"C\n\013DDGEINCPPIK\022\r\n\005st" +
      "ate\030\001 \001(\r\022\023\n\013LLNJKILEEBC\030\016 \001(\r\022\020\n\010quest_" +
      "id\030\010 \001(\rB\033\n\031emu.grasscutter.net.protob\006p" +
      "roto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_DDGEINCPPIK_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_DDGEINCPPIK_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_DDGEINCPPIK_descriptor,
        new java.lang.String[] { "State", "LLNJKILEEBC", "QuestId", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
