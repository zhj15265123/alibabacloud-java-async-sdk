// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ehpc20180412.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeImageRequest} extends {@link RequestModel}
 *
 * <p>DescribeImageRequest</p>
 */
public class DescribeImageRequest extends Request {
    @Query
    @NameInMap("ClusterId")
    @Validation(required = true)
    private String clusterId;

    @Query
    @NameInMap("ContainerType")
    private String containerType;

    @Query
    @NameInMap("ImageTag")
    private String imageTag;

    @Host
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Query
    @NameInMap("Repository")
    @Validation(required = true)
    private String repository;

    private DescribeImageRequest(Builder builder) {
        super(builder);
        this.clusterId = builder.clusterId;
        this.containerType = builder.containerType;
        this.imageTag = builder.imageTag;
        this.regionId = builder.regionId;
        this.repository = builder.repository;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeImageRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clusterId
     */
    public String getClusterId() {
        return this.clusterId;
    }

    /**
     * @return containerType
     */
    public String getContainerType() {
        return this.containerType;
    }

    /**
     * @return imageTag
     */
    public String getImageTag() {
        return this.imageTag;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return repository
     */
    public String getRepository() {
        return this.repository;
    }

    public static final class Builder extends Request.Builder<DescribeImageRequest, Builder> {
        private String clusterId; 
        private String containerType; 
        private String imageTag; 
        private String regionId; 
        private String repository; 

        private Builder() {
            super();
        } 

        private Builder(DescribeImageRequest response) {
            super(response);
            this.clusterId = response.clusterId;
            this.containerType = response.containerType;
            this.imageTag = response.imageTag;
            this.regionId = response.regionId;
            this.repository = response.repository;
        } 

        /**
         * ClusterId.
         */
        public Builder clusterId(String clusterId) {
            this.putQueryParameter("ClusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * ContainerType.
         */
        public Builder containerType(String containerType) {
            this.putQueryParameter("ContainerType", containerType);
            this.containerType = containerType;
            return this;
        }

        /**
         * ImageTag.
         */
        public Builder imageTag(String imageTag) {
            this.putQueryParameter("ImageTag", imageTag);
            this.imageTag = imageTag;
            return this;
        }

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * Repository.
         */
        public Builder repository(String repository) {
            this.putQueryParameter("Repository", repository);
            this.repository = repository;
            return this;
        }

        @Override
        public DescribeImageRequest build() {
            return new DescribeImageRequest(this);
        } 

    } 

}
