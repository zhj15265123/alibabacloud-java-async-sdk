// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.xgippop20220520.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetApplicationRequest} extends {@link RequestModel}
 *
 * <p>GetApplicationRequest</p>
 */
public class GetApplicationRequest extends Request {
    @Query
    @NameInMap("AliUid")
    private Long aliUid;

    @Query
    @NameInMap("AppCode")
    private String appCode;

    private GetApplicationRequest(Builder builder) {
        super(builder);
        this.aliUid = builder.aliUid;
        this.appCode = builder.appCode;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetApplicationRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return aliUid
     */
    public Long getAliUid() {
        return this.aliUid;
    }

    /**
     * @return appCode
     */
    public String getAppCode() {
        return this.appCode;
    }

    public static final class Builder extends Request.Builder<GetApplicationRequest, Builder> {
        private Long aliUid; 
        private String appCode; 

        private Builder() {
            super();
        } 

        private Builder(GetApplicationRequest request) {
            super(request);
            this.aliUid = request.aliUid;
            this.appCode = request.appCode;
        } 

        /**
         * 阿里UID
         */
        public Builder aliUid(Long aliUid) {
            this.putQueryParameter("AliUid", aliUid);
            this.aliUid = aliUid;
            return this;
        }

        /**
         * 应用ID
         */
        public Builder appCode(String appCode) {
            this.putQueryParameter("AppCode", appCode);
            this.appCode = appCode;
            return this;
        }

        @Override
        public GetApplicationRequest build() {
            return new GetApplicationRequest(this);
        } 

    } 

}
