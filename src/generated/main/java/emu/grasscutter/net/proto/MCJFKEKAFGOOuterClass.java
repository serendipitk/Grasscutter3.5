// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: MCJFKEKAFGO.proto

package emu.grasscutter.net.proto;

public final class MCJFKEKAFGOOuterClass {
  private MCJFKEKAFGOOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  /**
   * <pre>
   * Name: MCJFKEKAFGO
   * </pre>
   *
   * Protobuf enum {@code MCJFKEKAFGO}
   */
  public enum MCJFKEKAFGO
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <code>MCJFKEKAFGO_BPPDBCCCOAA = 0;</code>
     */
    MCJFKEKAFGO_BPPDBCCCOAA(0),
    /**
     * <code>MCJFKEKAFGO_JPMHGKDFAHK = 1;</code>
     */
    MCJFKEKAFGO_JPMHGKDFAHK(1),
    /**
     * <code>MCJFKEKAFGO_GCIFFKOIAFG = 2;</code>
     */
    MCJFKEKAFGO_GCIFFKOIAFG(2),
    /**
     * <code>MCJFKEKAFGO_HAJLBEECAMM = 3;</code>
     */
    MCJFKEKAFGO_HAJLBEECAMM(3),
    /**
     * <code>MCJFKEKAFGO_PIKKCILBFKC = 4;</code>
     */
    MCJFKEKAFGO_PIKKCILBFKC(4),
    /**
     * <code>MCJFKEKAFGO_OEIMHIFCPIK = 5;</code>
     */
    MCJFKEKAFGO_OEIMHIFCPIK(5),
    /**
     * <code>MCJFKEKAFGO_CAALGPKKBLB = 6;</code>
     */
    MCJFKEKAFGO_CAALGPKKBLB(6),
    UNRECOGNIZED(-1),
    ;

    /**
     * <code>MCJFKEKAFGO_BPPDBCCCOAA = 0;</code>
     */
    public static final int MCJFKEKAFGO_BPPDBCCCOAA_VALUE = 0;
    /**
     * <code>MCJFKEKAFGO_JPMHGKDFAHK = 1;</code>
     */
    public static final int MCJFKEKAFGO_JPMHGKDFAHK_VALUE = 1;
    /**
     * <code>MCJFKEKAFGO_GCIFFKOIAFG = 2;</code>
     */
    public static final int MCJFKEKAFGO_GCIFFKOIAFG_VALUE = 2;
    /**
     * <code>MCJFKEKAFGO_HAJLBEECAMM = 3;</code>
     */
    public static final int MCJFKEKAFGO_HAJLBEECAMM_VALUE = 3;
    /**
     * <code>MCJFKEKAFGO_PIKKCILBFKC = 4;</code>
     */
    public static final int MCJFKEKAFGO_PIKKCILBFKC_VALUE = 4;
    /**
     * <code>MCJFKEKAFGO_OEIMHIFCPIK = 5;</code>
     */
    public static final int MCJFKEKAFGO_OEIMHIFCPIK_VALUE = 5;
    /**
     * <code>MCJFKEKAFGO_CAALGPKKBLB = 6;</code>
     */
    public static final int MCJFKEKAFGO_CAALGPKKBLB_VALUE = 6;


    public final int getNumber() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalArgumentException(
            "Can't get the number of an unknown enum value.");
      }
      return value;
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static MCJFKEKAFGO valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static MCJFKEKAFGO forNumber(int value) {
      switch (value) {
        case 0: return MCJFKEKAFGO_BPPDBCCCOAA;
        case 1: return MCJFKEKAFGO_JPMHGKDFAHK;
        case 2: return MCJFKEKAFGO_GCIFFKOIAFG;
        case 3: return MCJFKEKAFGO_HAJLBEECAMM;
        case 4: return MCJFKEKAFGO_PIKKCILBFKC;
        case 5: return MCJFKEKAFGO_OEIMHIFCPIK;
        case 6: return MCJFKEKAFGO_CAALGPKKBLB;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<MCJFKEKAFGO>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        MCJFKEKAFGO> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<MCJFKEKAFGO>() {
            public MCJFKEKAFGO findValueByNumber(int number) {
              return MCJFKEKAFGO.forNumber(number);
            }
          };

    public final com.google.protobuf.Descriptors.EnumValueDescriptor
        getValueDescriptor() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalStateException(
            "Can't get the descriptor of an unrecognized enum value.");
      }
      return getDescriptor().getValues().get(ordinal());
    }
    public final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptorForType() {
      return getDescriptor();
    }
    public static final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.MCJFKEKAFGOOuterClass.getDescriptor().getEnumTypes().get(0);
    }

    private static final MCJFKEKAFGO[] VALUES = values();

    public static MCJFKEKAFGO valueOf(
        com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException(
          "EnumValueDescriptor is not for this type.");
      }
      if (desc.getIndex() == -1) {
        return UNRECOGNIZED;
      }
      return VALUES[desc.getIndex()];
    }

    private final int value;

    private MCJFKEKAFGO(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:MCJFKEKAFGO)
  }


  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\021MCJFKEKAFGO.proto*\330\001\n\013MCJFKEKAFGO\022\033\n\027M" +
      "CJFKEKAFGO_BPPDBCCCOAA\020\000\022\033\n\027MCJFKEKAFGO_" +
      "JPMHGKDFAHK\020\001\022\033\n\027MCJFKEKAFGO_GCIFFKOIAFG" +
      "\020\002\022\033\n\027MCJFKEKAFGO_HAJLBEECAMM\020\003\022\033\n\027MCJFK" +
      "EKAFGO_PIKKCILBFKC\020\004\022\033\n\027MCJFKEKAFGO_OEIM" +
      "HIFCPIK\020\005\022\033\n\027MCJFKEKAFGO_CAALGPKKBLB\020\006B\033" +
      "\n\031emu.grasscutter.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
