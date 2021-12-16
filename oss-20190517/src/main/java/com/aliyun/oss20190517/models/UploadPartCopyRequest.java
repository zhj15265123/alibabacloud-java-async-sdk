// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oss20190517.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

/**
 * {@link UploadPartCopyRequest} extends {@link RequestModel}
 *
 * <p>UploadPartCopyRequest</p>
 */
public class UploadPartCopyRequest extends Request {
    @Path
    @NameInMap("key")
    private String key;

    @Host
    @NameInMap("bucket")
    private String bucket;

    @Query
    @NameInMap("partNumber")
    private String partNumber;

    @Query
    @NameInMap("uploadId")
    private String uploadId;

    @Header
    @NameInMap("x-oss-copy-source")
    private String copySource;

    @Header
    @NameInMap("x-oss-copy-source-if-match")
    private String copySourceIfMatch;

    @Header
    @NameInMap("x-oss-copy-source-if-modified-since")
    private String copySourceIfModifiedSince;

    @Header
    @NameInMap("x-oss-copy-source-if-none-match")
    private String copySourceIfNoneMatch;

    @Header
    @NameInMap("x-oss-copy-source-if-unmodified-since")
    private String copySourceIfUnmodifiedSince;

    @Header
    @NameInMap("x-oss-copy-source-range")
    private String copySourceRange;


    private UploadPartCopyRequest(Builder builder) {
        super(builder);
        this.key = builder.key;
        this.bucket = builder.bucket;
        this.partNumber = builder.partNumber;
        this.uploadId = builder.uploadId;
        this.copySource = builder.copySource;
        this.copySourceIfMatch = builder.copySourceIfMatch;
        this.copySourceIfModifiedSince = builder.copySourceIfModifiedSince;
        this.copySourceIfNoneMatch = builder.copySourceIfNoneMatch;
        this.copySourceIfUnmodifiedSince = builder.copySourceIfUnmodifiedSince;
        this.copySourceRange = builder.copySourceRange;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UploadPartCopyRequest create() {
        return builder().build();
    }

    /**
     * @return key
     */
    public String getKey() {
        return this.key;
    }

    /**
     * @return bucket
     */
    public String getBucket() {
        return this.bucket;
    }

    /**
     * @return partNumber
     */
    public String getPartNumber() {
        return this.partNumber;
    }

    /**
     * @return uploadId
     */
    public String getUploadId() {
        return this.uploadId;
    }

    /**
     * @return copySource
     */
    public String getCopySource() {
        return this.copySource;
    }

    /**
     * @return copySourceIfMatch
     */
    public String getCopySourceIfMatch() {
        return this.copySourceIfMatch;
    }

    /**
     * @return copySourceIfModifiedSince
     */
    public String getCopySourceIfModifiedSince() {
        return this.copySourceIfModifiedSince;
    }

    /**
     * @return copySourceIfNoneMatch
     */
    public String getCopySourceIfNoneMatch() {
        return this.copySourceIfNoneMatch;
    }

    /**
     * @return copySourceIfUnmodifiedSince
     */
    public String getCopySourceIfUnmodifiedSince() {
        return this.copySourceIfUnmodifiedSince;
    }

    /**
     * @return copySourceRange
     */
    public String getCopySourceRange() {
        return this.copySourceRange;
    }

    public static final class Builder extends Request.Builder<Builder> {
        private String key; 
        private String bucket; 
        private String partNumber; 
        private String uploadId; 
        private String copySource; 
        private String copySourceIfMatch; 
        private String copySourceIfModifiedSince; 
        private String copySourceIfNoneMatch; 
        private String copySourceIfUnmodifiedSince; 
        private String copySourceRange; 

        /**
         * <p>key.</p>
         */
        public Builder key(String key) {
            this.putPathParameter("key", key);
            this.key = key;
            return this;
        }

        /**
         * <p>bucket.</p>
         */
        public Builder bucket(String bucket) {
            this.putHostParameter("bucket", bucket);
            this.bucket = bucket;
            return this;
        }

        /**
         * <p>partNumber.</p>
         */
        public Builder partNumber(String partNumber) {
            this.putQueryParameter("partNumber", partNumber);
            this.partNumber = partNumber;
            return this;
        }

        /**
         * <p>uploadId.</p>
         */
        public Builder uploadId(String uploadId) {
            this.putQueryParameter("uploadId", uploadId);
            this.uploadId = uploadId;
            return this;
        }

        /**
         * <p>x-oss-copy-source.</p>
         */
        public Builder copySource(String copySource) {
            this.putHeaderParameter("x-oss-copy-source", copySource);
            this.copySource = copySource;
            return this;
        }

        /**
         * <p>x-oss-copy-source-if-match.</p>
         */
        public Builder copySourceIfMatch(String copySourceIfMatch) {
            this.putHeaderParameter("x-oss-copy-source-if-match", copySourceIfMatch);
            this.copySourceIfMatch = copySourceIfMatch;
            return this;
        }

        /**
         * <p>x-oss-copy-source-if-modified-since.</p>
         */
        public Builder copySourceIfModifiedSince(String copySourceIfModifiedSince) {
            this.putHeaderParameter("x-oss-copy-source-if-modified-since", copySourceIfModifiedSince);
            this.copySourceIfModifiedSince = copySourceIfModifiedSince;
            return this;
        }

        /**
         * <p>x-oss-copy-source-if-none-match.</p>
         */
        public Builder copySourceIfNoneMatch(String copySourceIfNoneMatch) {
            this.putHeaderParameter("x-oss-copy-source-if-none-match", copySourceIfNoneMatch);
            this.copySourceIfNoneMatch = copySourceIfNoneMatch;
            return this;
        }

        /**
         * <p>x-oss-copy-source-if-unmodified-since.</p>
         */
        public Builder copySourceIfUnmodifiedSince(String copySourceIfUnmodifiedSince) {
            this.putHeaderParameter("x-oss-copy-source-if-unmodified-since", copySourceIfUnmodifiedSince);
            this.copySourceIfUnmodifiedSince = copySourceIfUnmodifiedSince;
            return this;
        }

        /**
         * <p>x-oss-copy-source-range.</p>
         */
        public Builder copySourceRange(String copySourceRange) {
            this.putHeaderParameter("x-oss-copy-source-range", copySourceRange);
            this.copySourceRange = copySourceRange;
            return this;
        }

        public UploadPartCopyRequest build() {
            return new UploadPartCopyRequest(this);
        } 

    } 

}
