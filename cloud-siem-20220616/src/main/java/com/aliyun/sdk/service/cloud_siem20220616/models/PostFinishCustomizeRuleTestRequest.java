// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloud_siem20220616.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link PostFinishCustomizeRuleTestRequest} extends {@link RequestModel}
 *
 * <p>PostFinishCustomizeRuleTestRequest</p>
 */
public class PostFinishCustomizeRuleTestRequest extends Request {
    @Body
    @NameInMap("Id")
    private Long id;

    @Body
    @NameInMap("RegionId")
    private String regionId;

    private PostFinishCustomizeRuleTestRequest(Builder builder) {
        super(builder);
        this.id = builder.id;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PostFinishCustomizeRuleTestRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return id
     */
    public Long getId() {
        return this.id;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<PostFinishCustomizeRuleTestRequest, Builder> {
        private Long id; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(PostFinishCustomizeRuleTestRequest request) {
            super(request);
            this.id = request.id;
            this.regionId = request.regionId;
        } 

        /**
         * Id.
         */
        public Builder id(Long id) {
            this.putBodyParameter("Id", id);
            this.id = id;
            return this;
        }

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putBodyParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public PostFinishCustomizeRuleTestRequest build() {
            return new PostFinishCustomizeRuleTestRequest(this);
        } 

    } 

}
