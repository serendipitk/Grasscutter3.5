// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: FCEGEHJMIMC.proto

package emu.grasscutter.net.proto;

public final class FCEGEHJMIMCOuterClass {
  private FCEGEHJMIMCOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface FCEGEHJMIMCOrBuilder extends
      // @@protoc_insertion_point(interface_extends:FCEGEHJMIMC)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 furniture_id = 12;</code>
     * @return The furnitureId.
     */
    int getFurnitureId();

    /**
     * <code>.Vector MGHIMMEFBDI = 7;</code>
     * @return Whether the mGHIMMEFBDI field is set.
     */
    boolean hasMGHIMMEFBDI();
    /**
     * <code>.Vector MGHIMMEFBDI = 7;</code>
     * @return The mGHIMMEFBDI.
     */
    emu.grasscutter.net.proto.VectorOuterClass.Vector getMGHIMMEFBDI();
    /**
     * <code>.Vector MGHIMMEFBDI = 7;</code>
     */
    emu.grasscutter.net.proto.VectorOuterClass.VectorOrBuilder getMGHIMMEFBDIOrBuilder();

    /**
     * <code>.Vector spawn_pos = 1;</code>
     * @return Whether the spawnPos field is set.
     */
    boolean hasSpawnPos();
    /**
     * <code>.Vector spawn_pos = 1;</code>
     * @return The spawnPos.
     */
    emu.grasscutter.net.proto.VectorOuterClass.Vector getSpawnPos();
    /**
     * <code>.Vector spawn_pos = 1;</code>
     */
    emu.grasscutter.net.proto.VectorOuterClass.VectorOrBuilder getSpawnPosOrBuilder();
  }
  /**
   * <pre>
   * Name: FCEGEHJMIMC
   * </pre>
   *
   * Protobuf type {@code FCEGEHJMIMC}
   */
  public static final class FCEGEHJMIMC extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:FCEGEHJMIMC)
      FCEGEHJMIMCOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use FCEGEHJMIMC.newBuilder() to construct.
    private FCEGEHJMIMC(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private FCEGEHJMIMC() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new FCEGEHJMIMC();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.FCEGEHJMIMCOuterClass.internal_static_FCEGEHJMIMC_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.FCEGEHJMIMCOuterClass.internal_static_FCEGEHJMIMC_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.FCEGEHJMIMCOuterClass.FCEGEHJMIMC.class, emu.grasscutter.net.proto.FCEGEHJMIMCOuterClass.FCEGEHJMIMC.Builder.class);
    }

    public static final int FURNITURE_ID_FIELD_NUMBER = 12;
    private int furnitureId_ = 0;
    /**
     * <code>uint32 furniture_id = 12;</code>
     * @return The furnitureId.
     */
    @java.lang.Override
    public int getFurnitureId() {
      return furnitureId_;
    }

    public static final int MGHIMMEFBDI_FIELD_NUMBER = 7;
    private emu.grasscutter.net.proto.VectorOuterClass.Vector mGHIMMEFBDI_;
    /**
     * <code>.Vector MGHIMMEFBDI = 7;</code>
     * @return Whether the mGHIMMEFBDI field is set.
     */
    @java.lang.Override
    public boolean hasMGHIMMEFBDI() {
      return mGHIMMEFBDI_ != null;
    }
    /**
     * <code>.Vector MGHIMMEFBDI = 7;</code>
     * @return The mGHIMMEFBDI.
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.VectorOuterClass.Vector getMGHIMMEFBDI() {
      return mGHIMMEFBDI_ == null ? emu.grasscutter.net.proto.VectorOuterClass.Vector.getDefaultInstance() : mGHIMMEFBDI_;
    }
    /**
     * <code>.Vector MGHIMMEFBDI = 7;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.VectorOuterClass.VectorOrBuilder getMGHIMMEFBDIOrBuilder() {
      return mGHIMMEFBDI_ == null ? emu.grasscutter.net.proto.VectorOuterClass.Vector.getDefaultInstance() : mGHIMMEFBDI_;
    }

    public static final int SPAWN_POS_FIELD_NUMBER = 1;
    private emu.grasscutter.net.proto.VectorOuterClass.Vector spawnPos_;
    /**
     * <code>.Vector spawn_pos = 1;</code>
     * @return Whether the spawnPos field is set.
     */
    @java.lang.Override
    public boolean hasSpawnPos() {
      return spawnPos_ != null;
    }
    /**
     * <code>.Vector spawn_pos = 1;</code>
     * @return The spawnPos.
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.VectorOuterClass.Vector getSpawnPos() {
      return spawnPos_ == null ? emu.grasscutter.net.proto.VectorOuterClass.Vector.getDefaultInstance() : spawnPos_;
    }
    /**
     * <code>.Vector spawn_pos = 1;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.VectorOuterClass.VectorOrBuilder getSpawnPosOrBuilder() {
      return spawnPos_ == null ? emu.grasscutter.net.proto.VectorOuterClass.Vector.getDefaultInstance() : spawnPos_;
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
      if (spawnPos_ != null) {
        output.writeMessage(1, getSpawnPos());
      }
      if (mGHIMMEFBDI_ != null) {
        output.writeMessage(7, getMGHIMMEFBDI());
      }
      if (furnitureId_ != 0) {
        output.writeUInt32(12, furnitureId_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (spawnPos_ != null) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(1, getSpawnPos());
      }
      if (mGHIMMEFBDI_ != null) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(7, getMGHIMMEFBDI());
      }
      if (furnitureId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(12, furnitureId_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.FCEGEHJMIMCOuterClass.FCEGEHJMIMC)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.FCEGEHJMIMCOuterClass.FCEGEHJMIMC other = (emu.grasscutter.net.proto.FCEGEHJMIMCOuterClass.FCEGEHJMIMC) obj;

      if (getFurnitureId()
          != other.getFurnitureId()) return false;
      if (hasMGHIMMEFBDI() != other.hasMGHIMMEFBDI()) return false;
      if (hasMGHIMMEFBDI()) {
        if (!getMGHIMMEFBDI()
            .equals(other.getMGHIMMEFBDI())) return false;
      }
      if (hasSpawnPos() != other.hasSpawnPos()) return false;
      if (hasSpawnPos()) {
        if (!getSpawnPos()
            .equals(other.getSpawnPos())) return false;
      }
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
      hash = (37 * hash) + FURNITURE_ID_FIELD_NUMBER;
      hash = (53 * hash) + getFurnitureId();
      if (hasMGHIMMEFBDI()) {
        hash = (37 * hash) + MGHIMMEFBDI_FIELD_NUMBER;
        hash = (53 * hash) + getMGHIMMEFBDI().hashCode();
      }
      if (hasSpawnPos()) {
        hash = (37 * hash) + SPAWN_POS_FIELD_NUMBER;
        hash = (53 * hash) + getSpawnPos().hashCode();
      }
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.FCEGEHJMIMCOuterClass.FCEGEHJMIMC parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.FCEGEHJMIMCOuterClass.FCEGEHJMIMC parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.FCEGEHJMIMCOuterClass.FCEGEHJMIMC parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.FCEGEHJMIMCOuterClass.FCEGEHJMIMC parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.FCEGEHJMIMCOuterClass.FCEGEHJMIMC parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.FCEGEHJMIMCOuterClass.FCEGEHJMIMC parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.FCEGEHJMIMCOuterClass.FCEGEHJMIMC parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.FCEGEHJMIMCOuterClass.FCEGEHJMIMC parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.FCEGEHJMIMCOuterClass.FCEGEHJMIMC parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.FCEGEHJMIMCOuterClass.FCEGEHJMIMC parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.FCEGEHJMIMCOuterClass.FCEGEHJMIMC parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.FCEGEHJMIMCOuterClass.FCEGEHJMIMC parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.FCEGEHJMIMCOuterClass.FCEGEHJMIMC prototype) {
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
     * Name: FCEGEHJMIMC
     * </pre>
     *
     * Protobuf type {@code FCEGEHJMIMC}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:FCEGEHJMIMC)
        emu.grasscutter.net.proto.FCEGEHJMIMCOuterClass.FCEGEHJMIMCOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.FCEGEHJMIMCOuterClass.internal_static_FCEGEHJMIMC_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.FCEGEHJMIMCOuterClass.internal_static_FCEGEHJMIMC_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.FCEGEHJMIMCOuterClass.FCEGEHJMIMC.class, emu.grasscutter.net.proto.FCEGEHJMIMCOuterClass.FCEGEHJMIMC.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.FCEGEHJMIMCOuterClass.FCEGEHJMIMC.newBuilder()
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
        furnitureId_ = 0;
        mGHIMMEFBDI_ = null;
        if (mGHIMMEFBDIBuilder_ != null) {
          mGHIMMEFBDIBuilder_.dispose();
          mGHIMMEFBDIBuilder_ = null;
        }
        spawnPos_ = null;
        if (spawnPosBuilder_ != null) {
          spawnPosBuilder_.dispose();
          spawnPosBuilder_ = null;
        }
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.FCEGEHJMIMCOuterClass.internal_static_FCEGEHJMIMC_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.FCEGEHJMIMCOuterClass.FCEGEHJMIMC getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.FCEGEHJMIMCOuterClass.FCEGEHJMIMC.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.FCEGEHJMIMCOuterClass.FCEGEHJMIMC build() {
        emu.grasscutter.net.proto.FCEGEHJMIMCOuterClass.FCEGEHJMIMC result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.FCEGEHJMIMCOuterClass.FCEGEHJMIMC buildPartial() {
        emu.grasscutter.net.proto.FCEGEHJMIMCOuterClass.FCEGEHJMIMC result = new emu.grasscutter.net.proto.FCEGEHJMIMCOuterClass.FCEGEHJMIMC(this);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartial0(emu.grasscutter.net.proto.FCEGEHJMIMCOuterClass.FCEGEHJMIMC result) {
        int from_bitField0_ = bitField0_;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          result.furnitureId_ = furnitureId_;
        }
        if (((from_bitField0_ & 0x00000002) != 0)) {
          result.mGHIMMEFBDI_ = mGHIMMEFBDIBuilder_ == null
              ? mGHIMMEFBDI_
              : mGHIMMEFBDIBuilder_.build();
        }
        if (((from_bitField0_ & 0x00000004) != 0)) {
          result.spawnPos_ = spawnPosBuilder_ == null
              ? spawnPos_
              : spawnPosBuilder_.build();
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
        if (other instanceof emu.grasscutter.net.proto.FCEGEHJMIMCOuterClass.FCEGEHJMIMC) {
          return mergeFrom((emu.grasscutter.net.proto.FCEGEHJMIMCOuterClass.FCEGEHJMIMC)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.FCEGEHJMIMCOuterClass.FCEGEHJMIMC other) {
        if (other == emu.grasscutter.net.proto.FCEGEHJMIMCOuterClass.FCEGEHJMIMC.getDefaultInstance()) return this;
        if (other.getFurnitureId() != 0) {
          setFurnitureId(other.getFurnitureId());
        }
        if (other.hasMGHIMMEFBDI()) {
          mergeMGHIMMEFBDI(other.getMGHIMMEFBDI());
        }
        if (other.hasSpawnPos()) {
          mergeSpawnPos(other.getSpawnPos());
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
              case 10: {
                input.readMessage(
                    getSpawnPosFieldBuilder().getBuilder(),
                    extensionRegistry);
                bitField0_ |= 0x00000004;
                break;
              } // case 10
              case 58: {
                input.readMessage(
                    getMGHIMMEFBDIFieldBuilder().getBuilder(),
                    extensionRegistry);
                bitField0_ |= 0x00000002;
                break;
              } // case 58
              case 96: {
                furnitureId_ = input.readUInt32();
                bitField0_ |= 0x00000001;
                break;
              } // case 96
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

      private int furnitureId_ ;
      /**
       * <code>uint32 furniture_id = 12;</code>
       * @return The furnitureId.
       */
      @java.lang.Override
      public int getFurnitureId() {
        return furnitureId_;
      }
      /**
       * <code>uint32 furniture_id = 12;</code>
       * @param value The furnitureId to set.
       * @return This builder for chaining.
       */
      public Builder setFurnitureId(int value) {
        
        furnitureId_ = value;
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 furniture_id = 12;</code>
       * @return This builder for chaining.
       */
      public Builder clearFurnitureId() {
        bitField0_ = (bitField0_ & ~0x00000001);
        furnitureId_ = 0;
        onChanged();
        return this;
      }

      private emu.grasscutter.net.proto.VectorOuterClass.Vector mGHIMMEFBDI_;
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.grasscutter.net.proto.VectorOuterClass.Vector, emu.grasscutter.net.proto.VectorOuterClass.Vector.Builder, emu.grasscutter.net.proto.VectorOuterClass.VectorOrBuilder> mGHIMMEFBDIBuilder_;
      /**
       * <code>.Vector MGHIMMEFBDI = 7;</code>
       * @return Whether the mGHIMMEFBDI field is set.
       */
      public boolean hasMGHIMMEFBDI() {
        return ((bitField0_ & 0x00000002) != 0);
      }
      /**
       * <code>.Vector MGHIMMEFBDI = 7;</code>
       * @return The mGHIMMEFBDI.
       */
      public emu.grasscutter.net.proto.VectorOuterClass.Vector getMGHIMMEFBDI() {
        if (mGHIMMEFBDIBuilder_ == null) {
          return mGHIMMEFBDI_ == null ? emu.grasscutter.net.proto.VectorOuterClass.Vector.getDefaultInstance() : mGHIMMEFBDI_;
        } else {
          return mGHIMMEFBDIBuilder_.getMessage();
        }
      }
      /**
       * <code>.Vector MGHIMMEFBDI = 7;</code>
       */
      public Builder setMGHIMMEFBDI(emu.grasscutter.net.proto.VectorOuterClass.Vector value) {
        if (mGHIMMEFBDIBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          mGHIMMEFBDI_ = value;
        } else {
          mGHIMMEFBDIBuilder_.setMessage(value);
        }
        bitField0_ |= 0x00000002;
        onChanged();
        return this;
      }
      /**
       * <code>.Vector MGHIMMEFBDI = 7;</code>
       */
      public Builder setMGHIMMEFBDI(
          emu.grasscutter.net.proto.VectorOuterClass.Vector.Builder builderForValue) {
        if (mGHIMMEFBDIBuilder_ == null) {
          mGHIMMEFBDI_ = builderForValue.build();
        } else {
          mGHIMMEFBDIBuilder_.setMessage(builderForValue.build());
        }
        bitField0_ |= 0x00000002;
        onChanged();
        return this;
      }
      /**
       * <code>.Vector MGHIMMEFBDI = 7;</code>
       */
      public Builder mergeMGHIMMEFBDI(emu.grasscutter.net.proto.VectorOuterClass.Vector value) {
        if (mGHIMMEFBDIBuilder_ == null) {
          if (((bitField0_ & 0x00000002) != 0) &&
            mGHIMMEFBDI_ != null &&
            mGHIMMEFBDI_ != emu.grasscutter.net.proto.VectorOuterClass.Vector.getDefaultInstance()) {
            getMGHIMMEFBDIBuilder().mergeFrom(value);
          } else {
            mGHIMMEFBDI_ = value;
          }
        } else {
          mGHIMMEFBDIBuilder_.mergeFrom(value);
        }
        bitField0_ |= 0x00000002;
        onChanged();
        return this;
      }
      /**
       * <code>.Vector MGHIMMEFBDI = 7;</code>
       */
      public Builder clearMGHIMMEFBDI() {
        bitField0_ = (bitField0_ & ~0x00000002);
        mGHIMMEFBDI_ = null;
        if (mGHIMMEFBDIBuilder_ != null) {
          mGHIMMEFBDIBuilder_.dispose();
          mGHIMMEFBDIBuilder_ = null;
        }
        onChanged();
        return this;
      }
      /**
       * <code>.Vector MGHIMMEFBDI = 7;</code>
       */
      public emu.grasscutter.net.proto.VectorOuterClass.Vector.Builder getMGHIMMEFBDIBuilder() {
        bitField0_ |= 0x00000002;
        onChanged();
        return getMGHIMMEFBDIFieldBuilder().getBuilder();
      }
      /**
       * <code>.Vector MGHIMMEFBDI = 7;</code>
       */
      public emu.grasscutter.net.proto.VectorOuterClass.VectorOrBuilder getMGHIMMEFBDIOrBuilder() {
        if (mGHIMMEFBDIBuilder_ != null) {
          return mGHIMMEFBDIBuilder_.getMessageOrBuilder();
        } else {
          return mGHIMMEFBDI_ == null ?
              emu.grasscutter.net.proto.VectorOuterClass.Vector.getDefaultInstance() : mGHIMMEFBDI_;
        }
      }
      /**
       * <code>.Vector MGHIMMEFBDI = 7;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.grasscutter.net.proto.VectorOuterClass.Vector, emu.grasscutter.net.proto.VectorOuterClass.Vector.Builder, emu.grasscutter.net.proto.VectorOuterClass.VectorOrBuilder> 
          getMGHIMMEFBDIFieldBuilder() {
        if (mGHIMMEFBDIBuilder_ == null) {
          mGHIMMEFBDIBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              emu.grasscutter.net.proto.VectorOuterClass.Vector, emu.grasscutter.net.proto.VectorOuterClass.Vector.Builder, emu.grasscutter.net.proto.VectorOuterClass.VectorOrBuilder>(
                  getMGHIMMEFBDI(),
                  getParentForChildren(),
                  isClean());
          mGHIMMEFBDI_ = null;
        }
        return mGHIMMEFBDIBuilder_;
      }

      private emu.grasscutter.net.proto.VectorOuterClass.Vector spawnPos_;
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.grasscutter.net.proto.VectorOuterClass.Vector, emu.grasscutter.net.proto.VectorOuterClass.Vector.Builder, emu.grasscutter.net.proto.VectorOuterClass.VectorOrBuilder> spawnPosBuilder_;
      /**
       * <code>.Vector spawn_pos = 1;</code>
       * @return Whether the spawnPos field is set.
       */
      public boolean hasSpawnPos() {
        return ((bitField0_ & 0x00000004) != 0);
      }
      /**
       * <code>.Vector spawn_pos = 1;</code>
       * @return The spawnPos.
       */
      public emu.grasscutter.net.proto.VectorOuterClass.Vector getSpawnPos() {
        if (spawnPosBuilder_ == null) {
          return spawnPos_ == null ? emu.grasscutter.net.proto.VectorOuterClass.Vector.getDefaultInstance() : spawnPos_;
        } else {
          return spawnPosBuilder_.getMessage();
        }
      }
      /**
       * <code>.Vector spawn_pos = 1;</code>
       */
      public Builder setSpawnPos(emu.grasscutter.net.proto.VectorOuterClass.Vector value) {
        if (spawnPosBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          spawnPos_ = value;
        } else {
          spawnPosBuilder_.setMessage(value);
        }
        bitField0_ |= 0x00000004;
        onChanged();
        return this;
      }
      /**
       * <code>.Vector spawn_pos = 1;</code>
       */
      public Builder setSpawnPos(
          emu.grasscutter.net.proto.VectorOuterClass.Vector.Builder builderForValue) {
        if (spawnPosBuilder_ == null) {
          spawnPos_ = builderForValue.build();
        } else {
          spawnPosBuilder_.setMessage(builderForValue.build());
        }
        bitField0_ |= 0x00000004;
        onChanged();
        return this;
      }
      /**
       * <code>.Vector spawn_pos = 1;</code>
       */
      public Builder mergeSpawnPos(emu.grasscutter.net.proto.VectorOuterClass.Vector value) {
        if (spawnPosBuilder_ == null) {
          if (((bitField0_ & 0x00000004) != 0) &&
            spawnPos_ != null &&
            spawnPos_ != emu.grasscutter.net.proto.VectorOuterClass.Vector.getDefaultInstance()) {
            getSpawnPosBuilder().mergeFrom(value);
          } else {
            spawnPos_ = value;
          }
        } else {
          spawnPosBuilder_.mergeFrom(value);
        }
        bitField0_ |= 0x00000004;
        onChanged();
        return this;
      }
      /**
       * <code>.Vector spawn_pos = 1;</code>
       */
      public Builder clearSpawnPos() {
        bitField0_ = (bitField0_ & ~0x00000004);
        spawnPos_ = null;
        if (spawnPosBuilder_ != null) {
          spawnPosBuilder_.dispose();
          spawnPosBuilder_ = null;
        }
        onChanged();
        return this;
      }
      /**
       * <code>.Vector spawn_pos = 1;</code>
       */
      public emu.grasscutter.net.proto.VectorOuterClass.Vector.Builder getSpawnPosBuilder() {
        bitField0_ |= 0x00000004;
        onChanged();
        return getSpawnPosFieldBuilder().getBuilder();
      }
      /**
       * <code>.Vector spawn_pos = 1;</code>
       */
      public emu.grasscutter.net.proto.VectorOuterClass.VectorOrBuilder getSpawnPosOrBuilder() {
        if (spawnPosBuilder_ != null) {
          return spawnPosBuilder_.getMessageOrBuilder();
        } else {
          return spawnPos_ == null ?
              emu.grasscutter.net.proto.VectorOuterClass.Vector.getDefaultInstance() : spawnPos_;
        }
      }
      /**
       * <code>.Vector spawn_pos = 1;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.grasscutter.net.proto.VectorOuterClass.Vector, emu.grasscutter.net.proto.VectorOuterClass.Vector.Builder, emu.grasscutter.net.proto.VectorOuterClass.VectorOrBuilder> 
          getSpawnPosFieldBuilder() {
        if (spawnPosBuilder_ == null) {
          spawnPosBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              emu.grasscutter.net.proto.VectorOuterClass.Vector, emu.grasscutter.net.proto.VectorOuterClass.Vector.Builder, emu.grasscutter.net.proto.VectorOuterClass.VectorOrBuilder>(
                  getSpawnPos(),
                  getParentForChildren(),
                  isClean());
          spawnPos_ = null;
        }
        return spawnPosBuilder_;
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


      // @@protoc_insertion_point(builder_scope:FCEGEHJMIMC)
    }

    // @@protoc_insertion_point(class_scope:FCEGEHJMIMC)
    private static final emu.grasscutter.net.proto.FCEGEHJMIMCOuterClass.FCEGEHJMIMC DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.FCEGEHJMIMCOuterClass.FCEGEHJMIMC();
    }

    public static emu.grasscutter.net.proto.FCEGEHJMIMCOuterClass.FCEGEHJMIMC getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<FCEGEHJMIMC>
        PARSER = new com.google.protobuf.AbstractParser<FCEGEHJMIMC>() {
      @java.lang.Override
      public FCEGEHJMIMC parsePartialFrom(
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

    public static com.google.protobuf.Parser<FCEGEHJMIMC> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<FCEGEHJMIMC> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.FCEGEHJMIMCOuterClass.FCEGEHJMIMC getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_FCEGEHJMIMC_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_FCEGEHJMIMC_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\021FCEGEHJMIMC.proto\032\014Vector.proto\"]\n\013FCE" +
      "GEHJMIMC\022\024\n\014furniture_id\030\014 \001(\r\022\034\n\013MGHIMM" +
      "EFBDI\030\007 \001(\0132\007.Vector\022\032\n\tspawn_pos\030\001 \001(\0132" +
      "\007.VectorB\033\n\031emu.grasscutter.net.protob\006p" +
      "roto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.grasscutter.net.proto.VectorOuterClass.getDescriptor(),
        });
    internal_static_FCEGEHJMIMC_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_FCEGEHJMIMC_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_FCEGEHJMIMC_descriptor,
        new java.lang.String[] { "FurnitureId", "MGHIMMEFBDI", "SpawnPos", });
    emu.grasscutter.net.proto.VectorOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
