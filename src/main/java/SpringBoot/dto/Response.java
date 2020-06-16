// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Project.proto

package SpringBoot.dto;

/**
 * Protobuf type {@code routeguide.Response}
 */
public final class Response extends
        com.google.protobuf.GeneratedMessageV3 implements
        // @@protoc_insertion_point(message_implements:routeguide.Response)
        ResponseOrBuilder {
    private static final long serialVersionUID = 0L;

    // Use Response.newBuilder() to construct.
    private Response(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
        super(builder);
    }

    private Response() {
        message_ = "";
    }

    @Override
    @SuppressWarnings({"unused"})
    protected Object newInstance(
            UnusedPrivateParameter unused) {
        return new Response();
    }

    @Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
        return this.unknownFields;
    }

    private Response(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
        this();
        if (extensionRegistry == null) {
            throw new NullPointerException();
        }
        com.google.protobuf.UnknownFieldSet.Builder unknownFields =
                com.google.protobuf.UnknownFieldSet.newBuilder();
        try {
            boolean done = false;
            while (!done) {
                int tag = input.readTag();
                switch (tag) {
                    case 0:
                        done = true;
                        break;
                    case 8: {

                        isSuccess_ = input.readInt32();
                        break;
                    }
                    case 18: {
                        String s = input.readStringRequireUtf8();

                        message_ = s;
                        break;
                    }
                    default: {
                        if (!parseUnknownField(
                                input, unknownFields, extensionRegistry, tag)) {
                            done = true;
                        }
                        break;
                    }
                }
            }
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
            throw e.setUnfinishedMessage(this);
        } catch (java.io.IOException e) {
            throw new com.google.protobuf.InvalidProtocolBufferException(
                    e).setUnfinishedMessage(this);
        } finally {
            this.unknownFields = unknownFields.build();
            makeExtensionsImmutable();
        }
    }

    public static final com.google.protobuf.Descriptors.Descriptor
    getDescriptor() {
        return MyProto.internal_static_routeguide_Response_descriptor;
    }

    @Override
    protected FieldAccessorTable
    internalGetFieldAccessorTable() {
        return MyProto.internal_static_routeguide_Response_fieldAccessorTable
                .ensureFieldAccessorsInitialized(
                        Response.class, Builder.class);
    }

    public static final int IS_SUCCESS_FIELD_NUMBER = 1;
    private int isSuccess_;

    /**
     * <code>int32 is_success = 1;</code>
     *
     * @return The isSuccess.
     */
    public int getIsSuccess() {
        return isSuccess_;
    }

    public static final int MESSAGE_FIELD_NUMBER = 2;
    private volatile Object message_;

    /**
     * <code>string message = 2;</code>
     *
     * @return The message.
     */
    public String getMessage() {
        Object ref = message_;
        if (ref instanceof String) {
            return (String) ref;
        } else {
            com.google.protobuf.ByteString bs =
                    (com.google.protobuf.ByteString) ref;
            String s = bs.toStringUtf8();
            message_ = s;
            return s;
        }
    }

    /**
     * <code>string message = 2;</code>
     *
     * @return The bytes for message.
     */
    public com.google.protobuf.ByteString
    getMessageBytes() {
        Object ref = message_;
        if (ref instanceof String) {
            com.google.protobuf.ByteString b =
                    com.google.protobuf.ByteString.copyFromUtf8(
                            (String) ref);
            message_ = b;
            return b;
        } else {
            return (com.google.protobuf.ByteString) ref;
        }
    }

    private byte memoizedIsInitialized = -1;

    @Override
    public final boolean isInitialized() {
        byte isInitialized = memoizedIsInitialized;
        if (isInitialized == 1) return true;
        if (isInitialized == 0) return false;

        memoizedIsInitialized = 1;
        return true;
    }

    @Override
    public void writeTo(com.google.protobuf.CodedOutputStream output)
            throws java.io.IOException {
        if (isSuccess_ != 0) {
            output.writeInt32(1, isSuccess_);
        }
        if (!getMessageBytes().isEmpty()) {
            com.google.protobuf.GeneratedMessageV3.writeString(output, 2, message_);
        }
        unknownFields.writeTo(output);
    }

    @Override
    public int getSerializedSize() {
        int size = memoizedSize;
        if (size != -1) return size;

        size = 0;
        if (isSuccess_ != 0) {
            size += com.google.protobuf.CodedOutputStream
                    .computeInt32Size(1, isSuccess_);
        }
        if (!getMessageBytes().isEmpty()) {
            size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, message_);
        }
        size += unknownFields.getSerializedSize();
        memoizedSize = size;
        return size;
    }

    @Override
    public boolean equals(final Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Response)) {
            return super.equals(obj);
        }
        Response other = (Response) obj;

        if (getIsSuccess()
                != other.getIsSuccess()) return false;
        if (!getMessage()
                .equals(other.getMessage())) return false;
        if (!unknownFields.equals(other.unknownFields)) return false;
        return true;
    }

    @Override
    public int hashCode() {
        if (memoizedHashCode != 0) {
            return memoizedHashCode;
        }
        int hash = 41;
        hash = (19 * hash) + getDescriptor().hashCode();
        hash = (37 * hash) + IS_SUCCESS_FIELD_NUMBER;
        hash = (53 * hash) + getIsSuccess();
        hash = (37 * hash) + MESSAGE_FIELD_NUMBER;
        hash = (53 * hash) + getMessage().hashCode();
        hash = (29 * hash) + unknownFields.hashCode();
        memoizedHashCode = hash;
        return hash;
    }

    public static Response parseFrom(
            java.nio.ByteBuffer data)
            throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data);
    }

    public static Response parseFrom(
            java.nio.ByteBuffer data,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data, extensionRegistry);
    }

    public static Response parseFrom(
            com.google.protobuf.ByteString data)
            throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data);
    }

    public static Response parseFrom(
            com.google.protobuf.ByteString data,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data, extensionRegistry);
    }

    public static Response parseFrom(byte[] data)
            throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data);
    }

    public static Response parseFrom(
            byte[] data,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data, extensionRegistry);
    }

    public static Response parseFrom(java.io.InputStream input)
            throws java.io.IOException {
        return com.google.protobuf.GeneratedMessageV3
                .parseWithIOException(PARSER, input);
    }

    public static Response parseFrom(
            java.io.InputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws java.io.IOException {
        return com.google.protobuf.GeneratedMessageV3
                .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public static Response parseDelimitedFrom(java.io.InputStream input)
            throws java.io.IOException {
        return com.google.protobuf.GeneratedMessageV3
                .parseDelimitedWithIOException(PARSER, input);
    }

    public static Response parseDelimitedFrom(
            java.io.InputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws java.io.IOException {
        return com.google.protobuf.GeneratedMessageV3
                .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }

    public static Response parseFrom(
            com.google.protobuf.CodedInputStream input)
            throws java.io.IOException {
        return com.google.protobuf.GeneratedMessageV3
                .parseWithIOException(PARSER, input);
    }

    public static Response parseFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws java.io.IOException {
        return com.google.protobuf.GeneratedMessageV3
                .parseWithIOException(PARSER, input, extensionRegistry);
    }

    @Override
    public Builder newBuilderForType() {
        return newBuilder();
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static Builder newBuilder(Response prototype) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }

    @Override
    public Builder toBuilder() {
        return this == DEFAULT_INSTANCE
                ? new Builder() : new Builder().mergeFrom(this);
    }

    @Override
    protected Builder newBuilderForType(
            BuilderParent parent) {
        Builder builder = new Builder(parent);
        return builder;
    }

    /**
     * Protobuf type {@code routeguide.Response}
     */
    public static final class Builder extends
            com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
            // @@protoc_insertion_point(builder_implements:routeguide.Response)
            ResponseOrBuilder {
        public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
            return MyProto.internal_static_routeguide_Response_descriptor;
        }

        @Override
        protected FieldAccessorTable
        internalGetFieldAccessorTable() {
            return MyProto.internal_static_routeguide_Response_fieldAccessorTable
                    .ensureFieldAccessorsInitialized(
                            Response.class, Builder.class);
        }

        // Construct using generatedclass.Response.newBuilder()
        private Builder() {
            maybeForceBuilderInitialization();
        }

        private Builder(
                BuilderParent parent) {
            super(parent);
            maybeForceBuilderInitialization();
        }

        private void maybeForceBuilderInitialization() {
            if (com.google.protobuf.GeneratedMessageV3
                    .alwaysUseFieldBuilders) {
            }
        }

        @Override
        public Builder clear() {
            super.clear();
            isSuccess_ = 0;

            message_ = "";

            return this;
        }

        @Override
        public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
            return MyProto.internal_static_routeguide_Response_descriptor;
        }

        @Override
        public Response getDefaultInstanceForType() {
            return Response.getDefaultInstance();
        }

        @Override
        public Response build() {
            Response result = buildPartial();
            if (!result.isInitialized()) {
                throw newUninitializedMessageException(result);
            }
            return result;
        }

        @Override
        public Response buildPartial() {
            Response result = new Response(this);
            result.isSuccess_ = isSuccess_;
            result.message_ = message_;
            onBuilt();
            return result;
        }

        @Override
        public Builder clone() {
            return super.clone();
        }

        @Override
        public Builder setField(
                com.google.protobuf.Descriptors.FieldDescriptor field,
                Object value) {
            return super.setField(field, value);
        }

        @Override
        public Builder clearField(
                com.google.protobuf.Descriptors.FieldDescriptor field) {
            return super.clearField(field);
        }

        @Override
        public Builder clearOneof(
                com.google.protobuf.Descriptors.OneofDescriptor oneof) {
            return super.clearOneof(oneof);
        }

        @Override
        public Builder setRepeatedField(
                com.google.protobuf.Descriptors.FieldDescriptor field,
                int index, Object value) {
            return super.setRepeatedField(field, index, value);
        }

        @Override
        public Builder addRepeatedField(
                com.google.protobuf.Descriptors.FieldDescriptor field,
                Object value) {
            return super.addRepeatedField(field, value);
        }

        @Override
        public Builder mergeFrom(com.google.protobuf.Message other) {
            if (other instanceof Response) {
                return mergeFrom((Response) other);
            } else {
                super.mergeFrom(other);
                return this;
            }
        }

        public Builder mergeFrom(Response other) {
            if (other == Response.getDefaultInstance()) return this;
            if (other.getIsSuccess() != 0) {
                setIsSuccess(other.getIsSuccess());
            }
            if (!other.getMessage().isEmpty()) {
                message_ = other.message_;
                onChanged();
            }
            this.mergeUnknownFields(other.unknownFields);
            onChanged();
            return this;
        }

        @Override
        public final boolean isInitialized() {
            return true;
        }

        @Override
        public Builder mergeFrom(
                com.google.protobuf.CodedInputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            Response parsedMessage = null;
            try {
                parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                parsedMessage = (Response) e.getUnfinishedMessage();
                throw e.unwrapIOException();
            } finally {
                if (parsedMessage != null) {
                    mergeFrom(parsedMessage);
                }
            }
            return this;
        }

        private int isSuccess_;

        /**
         * <code>int32 is_success = 1;</code>
         *
         * @return The isSuccess.
         */
        public int getIsSuccess() {
            return isSuccess_;
        }

        /**
         * <code>int32 is_success = 1;</code>
         *
         * @param value The isSuccess to set.
         * @return This builder for chaining.
         */
        public Builder setIsSuccess(int value) {

            isSuccess_ = value;
            onChanged();
            return this;
        }

        /**
         * <code>int32 is_success = 1;</code>
         *
         * @return This builder for chaining.
         */
        public Builder clearIsSuccess() {

            isSuccess_ = 0;
            onChanged();
            return this;
        }

        private Object message_ = "";

        /**
         * <code>string message = 2;</code>
         *
         * @return The message.
         */
        public String getMessage() {
            Object ref = message_;
            if (!(ref instanceof String)) {
                com.google.protobuf.ByteString bs =
                        (com.google.protobuf.ByteString) ref;
                String s = bs.toStringUtf8();
                message_ = s;
                return s;
            } else {
                return (String) ref;
            }
        }

        /**
         * <code>string message = 2;</code>
         *
         * @return The bytes for message.
         */
        public com.google.protobuf.ByteString
        getMessageBytes() {
            Object ref = message_;
            if (ref instanceof String) {
                com.google.protobuf.ByteString b =
                        com.google.protobuf.ByteString.copyFromUtf8(
                                (String) ref);
                message_ = b;
                return b;
            } else {
                return (com.google.protobuf.ByteString) ref;
            }
        }

        /**
         * <code>string message = 2;</code>
         *
         * @param value The message to set.
         * @return This builder for chaining.
         */
        public Builder setMessage(
                String value) {
            if (value == null) {
                throw new NullPointerException();
            }

            message_ = value;
            onChanged();
            return this;
        }

        /**
         * <code>string message = 2;</code>
         *
         * @return This builder for chaining.
         */
        public Builder clearMessage() {

            message_ = getDefaultInstance().getMessage();
            onChanged();
            return this;
        }

        /**
         * <code>string message = 2;</code>
         *
         * @param value The bytes for message to set.
         * @return This builder for chaining.
         */
        public Builder setMessageBytes(
                com.google.protobuf.ByteString value) {
            if (value == null) {
                throw new NullPointerException();
            }
            checkByteStringIsUtf8(value);

            message_ = value;
            onChanged();
            return this;
        }

        @Override
        public final Builder setUnknownFields(
                final com.google.protobuf.UnknownFieldSet unknownFields) {
            return super.setUnknownFields(unknownFields);
        }

        @Override
        public final Builder mergeUnknownFields(
                final com.google.protobuf.UnknownFieldSet unknownFields) {
            return super.mergeUnknownFields(unknownFields);
        }


        // @@protoc_insertion_point(builder_scope:routeguide.Response)
    }

    // @@protoc_insertion_point(class_scope:routeguide.Response)
    private static final Response DEFAULT_INSTANCE;

    static {
        DEFAULT_INSTANCE = new Response();
    }

    public static Response getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<Response>
            PARSER = new com.google.protobuf.AbstractParser<Response>() {
        @Override
        public Response parsePartialFrom(
                com.google.protobuf.CodedInputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return new Response(input, extensionRegistry);
        }
    };

    public static com.google.protobuf.Parser<Response> parser() {
        return PARSER;
    }

    @Override
    public com.google.protobuf.Parser<Response> getParserForType() {
        return PARSER;
    }

    @Override
    public Response getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }

}

