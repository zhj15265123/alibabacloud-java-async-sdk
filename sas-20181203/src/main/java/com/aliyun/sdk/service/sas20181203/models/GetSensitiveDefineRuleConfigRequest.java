// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetSensitiveDefineRuleConfigRequest} extends {@link RequestModel}
 *
 * <p>GetSensitiveDefineRuleConfigRequest</p>
 */
public class GetSensitiveDefineRuleConfigRequest extends Request {
    @Query
    @NameInMap("Lang")
    private String lang;

    private GetSensitiveDefineRuleConfigRequest(Builder builder) {
        super(builder);
        this.lang = builder.lang;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetSensitiveDefineRuleConfigRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return lang
     */
    public String getLang() {
        return this.lang;
    }

    public static final class Builder extends Request.Builder<GetSensitiveDefineRuleConfigRequest, Builder> {
        private String lang; 

        private Builder() {
            super();
        } 

        private Builder(GetSensitiveDefineRuleConfigRequest request) {
            super(request);
            this.lang = request.lang;
        } 

        /**
         * Lang.
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        @Override
        public GetSensitiveDefineRuleConfigRequest build() {
            return new GetSensitiveDefineRuleConfigRequest(this);
        } 

    } 

}
