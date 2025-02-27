// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListPrivateRegistryTypeRequest} extends {@link RequestModel}
 *
 * <p>ListPrivateRegistryTypeRequest</p>
 */
public class ListPrivateRegistryTypeRequest extends Request {
    @Query
    @NameInMap("Lang")
    private String lang;

    private ListPrivateRegistryTypeRequest(Builder builder) {
        super(builder);
        this.lang = builder.lang;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListPrivateRegistryTypeRequest create() {
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

    public static final class Builder extends Request.Builder<ListPrivateRegistryTypeRequest, Builder> {
        private String lang; 

        private Builder() {
            super();
        } 

        private Builder(ListPrivateRegistryTypeRequest request) {
            super(request);
            this.lang = request.lang;
        } 

        /**
         * 请求和接收消息的语言类型。取值：
         * <p>
         * - **zh**：中文
         * - **en**：英文
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        @Override
        public ListPrivateRegistryTypeRequest build() {
            return new ListPrivateRegistryTypeRequest(this);
        } 

    } 

}
