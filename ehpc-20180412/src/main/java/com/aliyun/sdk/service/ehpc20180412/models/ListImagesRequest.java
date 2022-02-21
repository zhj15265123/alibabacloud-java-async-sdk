// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ehpc20180412.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListImagesRequest} extends {@link RequestModel}
 *
 * <p>ListImagesRequest</p>
 */
public class ListImagesRequest extends Request {
    @Query
    @NameInMap("BaseOsTag")
    private String baseOsTag;

    @Query
    @NameInMap("InstanceType")
    private String instanceType;

    private ListImagesRequest(Builder builder) {
        super(builder);
        this.baseOsTag = builder.baseOsTag;
        this.instanceType = builder.instanceType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListImagesRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return baseOsTag
     */
    public String getBaseOsTag() {
        return this.baseOsTag;
    }

    /**
     * @return instanceType
     */
    public String getInstanceType() {
        return this.instanceType;
    }

    public static final class Builder extends Request.Builder<ListImagesRequest, Builder> {
        private String baseOsTag; 
        private String instanceType; 

        private Builder() {
            super();
        } 

        private Builder(ListImagesRequest response) {
            super(response);
            this.baseOsTag = response.baseOsTag;
            this.instanceType = response.instanceType;
        } 

        /**
         * BaseOsTag.
         */
        public Builder baseOsTag(String baseOsTag) {
            this.putQueryParameter("BaseOsTag", baseOsTag);
            this.baseOsTag = baseOsTag;
            return this;
        }

        /**
         * InstanceType.
         */
        public Builder instanceType(String instanceType) {
            this.putQueryParameter("InstanceType", instanceType);
            this.instanceType = instanceType;
            return this;
        }

        @Override
        public ListImagesRequest build() {
            return new ListImagesRequest(this);
        } 

    } 

}
