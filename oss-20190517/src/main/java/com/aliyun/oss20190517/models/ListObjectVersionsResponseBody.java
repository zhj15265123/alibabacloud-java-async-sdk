// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oss20190517.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

/**
 * {@link ListObjectVersionsResponseBody} extends {@link TeaModel}
 *
 * <p>ListObjectVersionsResponseBody</p>
 */
public class ListObjectVersionsResponseBody extends TeaModel {
    @ParentIgnore("ListVersionsResult")
    @NameInMap("CommonPrefixes")
    private java.util.List < CommonPrefix > commonPrefixes;

    @ParentIgnore("ListVersionsResult")
    @NameInMap("DeleteMarker")
    private java.util.List < DeleteMarkerEntry > deleteMarkers;

    @ParentIgnore("ListVersionsResult")
    @NameInMap("Delimiter")
    private String delimiter;

    @ParentIgnore("ListVersionsResult")
    @NameInMap("EncodingType")
    private String encodingType;

    @ParentIgnore("ListVersionsResult")
    @NameInMap("IsTruncated")
    private Boolean isTruncated;

    @ParentIgnore("ListVersionsResult")
    @NameInMap("KeyMarker")
    private String keyMarker;

    @ParentIgnore("ListVersionsResult")
    @NameInMap("MaxKeys")
    private Long maxKeys;

    @ParentIgnore("ListVersionsResult")
    @NameInMap("Name")
    private String name;

    @ParentIgnore("ListVersionsResult")
    @NameInMap("NextKeyMarker")
    private String nextKeyMarker;

    @ParentIgnore("ListVersionsResult")
    @NameInMap("NextVersionIdMarker")
    private String nextVersionIdMarker;

    @ParentIgnore("ListVersionsResult")
    @NameInMap("Prefix")
    private String prefix;

    @ParentIgnore("ListVersionsResult")
    @NameInMap("Version")
    private java.util.List < ObjectVersion > versions;

    @ParentIgnore("ListVersionsResult")
    @NameInMap("VersionIdMarker")
    private String versionIdMarker;


    private ListObjectVersionsResponseBody(Builder builder) {
        this.commonPrefixes = builder.commonPrefixes;
        this.deleteMarkers = builder.deleteMarkers;
        this.delimiter = builder.delimiter;
        this.encodingType = builder.encodingType;
        this.isTruncated = builder.isTruncated;
        this.keyMarker = builder.keyMarker;
        this.maxKeys = builder.maxKeys;
        this.name = builder.name;
        this.nextKeyMarker = builder.nextKeyMarker;
        this.nextVersionIdMarker = builder.nextVersionIdMarker;
        this.prefix = builder.prefix;
        this.versions = builder.versions;
        this.versionIdMarker = builder.versionIdMarker;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListObjectVersionsResponseBody create() {
        return builder().build();
    }

    /**
     * @return commonPrefixes
     */
    public java.util.List < CommonPrefix > getCommonPrefixes() {
        return this.commonPrefixes;
    }

    /**
     * @return deleteMarkers
     */
    public java.util.List < DeleteMarkerEntry > getDeleteMarkers() {
        return this.deleteMarkers;
    }

    /**
     * @return delimiter
     */
    public String getDelimiter() {
        return this.delimiter;
    }

    /**
     * @return encodingType
     */
    public String getEncodingType() {
        return this.encodingType;
    }

    /**
     * @return isTruncated
     */
    public Boolean getIsTruncated() {
        return this.isTruncated;
    }

    /**
     * @return keyMarker
     */
    public String getKeyMarker() {
        return this.keyMarker;
    }

    /**
     * @return maxKeys
     */
    public Long getMaxKeys() {
        return this.maxKeys;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return nextKeyMarker
     */
    public String getNextKeyMarker() {
        return this.nextKeyMarker;
    }

    /**
     * @return nextVersionIdMarker
     */
    public String getNextVersionIdMarker() {
        return this.nextVersionIdMarker;
    }

    /**
     * @return prefix
     */
    public String getPrefix() {
        return this.prefix;
    }

    /**
     * @return versions
     */
    public java.util.List < ObjectVersion > getVersions() {
        return this.versions;
    }

    /**
     * @return versionIdMarker
     */
    public String getVersionIdMarker() {
        return this.versionIdMarker;
    }

    public static final class Builder {
        private java.util.List < CommonPrefix > commonPrefixes; 
        private java.util.List < DeleteMarkerEntry > deleteMarkers; 
        private String delimiter; 
        private String encodingType; 
        private Boolean isTruncated; 
        private String keyMarker; 
        private Long maxKeys; 
        private String name; 
        private String nextKeyMarker; 
        private String nextVersionIdMarker; 
        private String prefix; 
        private java.util.List < ObjectVersion > versions; 
        private String versionIdMarker; 

        /**
         * <p>Objects whose names contain the same string that ranges from the prefix to the next occurrence of the delimiter are grouped as a single result element</p>
         */
        public Builder commonPrefixes(java.util.List < CommonPrefix > commonPrefixes) {
            this.commonPrefixes = commonPrefixes;
            return this;
        }

        /**
         * <p>The container that stores delete markers</p>
         */
        public Builder deleteMarkers(java.util.List < DeleteMarkerEntry > deleteMarkers) {
            this.deleteMarkers = deleteMarkers;
            return this;
        }

        /**
         * <p>Delimiter.</p>
         */
        public Builder delimiter(String delimiter) {
            this.delimiter = delimiter;
            return this;
        }

        /**
         * <p>EncodingType.</p>
         */
        public Builder encodingType(String encodingType) {
            this.encodingType = encodingType;
            return this;
        }

        /**
         * <p>Indicates whether the returned results are truncated</p>
         */
        public Builder isTruncated(Boolean isTruncated) {
            this.isTruncated = isTruncated;
            return this;
        }

        /**
         * <p>Indicates the object from which the operation starts</p>
         */
        public Builder keyMarker(String keyMarker) {
            this.keyMarker = keyMarker;
            return this;
        }

        /**
         * <p>The maximum number of returned objects in the response</p>
         */
        public Builder maxKeys(Long maxKeys) {
            this.maxKeys = maxKeys;
            return this;
        }

        /**
         * <p>The bucket name</p>
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * <p>NextKeyMarker.</p>
         */
        public Builder nextKeyMarker(String nextKeyMarker) {
            this.nextKeyMarker = nextKeyMarker;
            return this;
        }

        /**
         * <p>NextVersionIdMarker.</p>
         */
        public Builder nextVersionIdMarker(String nextVersionIdMarker) {
            this.nextVersionIdMarker = nextVersionIdMarker;
            return this;
        }

        /**
         * <p>The prefix that the names of returned objects must contain</p>
         */
        public Builder prefix(String prefix) {
            this.prefix = prefix;
            return this;
        }

        /**
         * <p>The container that stores the versions of objects except for delete markers</p>
         */
        public Builder versions(java.util.List < ObjectVersion > versions) {
            this.versions = versions;
            return this;
        }

        /**
         * <p>This parameter is returned with KeyMarker together to indicate the version from which the operation starts</p>
         */
        public Builder versionIdMarker(String versionIdMarker) {
            this.versionIdMarker = versionIdMarker;
            return this;
        }

        public ListObjectVersionsResponseBody build() {
            return new ListObjectVersionsResponseBody(this);
        } 

    } 

}
