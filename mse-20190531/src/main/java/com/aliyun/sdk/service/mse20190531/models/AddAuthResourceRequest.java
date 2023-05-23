// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mse20190531.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AddAuthResourceRequest} extends {@link RequestModel}
 *
 * <p>AddAuthResourceRequest</p>
 */
public class AddAuthResourceRequest extends Request {
    @Query
    @NameInMap("AcceptLanguage")
    private String acceptLanguage;

    @Query
    @NameInMap("AuthId")
    private Long authId;

    @Query
    @NameInMap("AuthResourceHeaderList")
    private java.util.List < AuthResourceHeaderList> authResourceHeaderList;

    @Query
    @NameInMap("DomainId")
    private Long domainId;

    @Query
    @NameInMap("GatewayUniqueId")
    private String gatewayUniqueId;

    @Query
    @NameInMap("IgnoreCase")
    private Boolean ignoreCase;

    @Query
    @NameInMap("MatchType")
    private String matchType;

    @Query
    @NameInMap("Path")
    private String path;

    private AddAuthResourceRequest(Builder builder) {
        super(builder);
        this.acceptLanguage = builder.acceptLanguage;
        this.authId = builder.authId;
        this.authResourceHeaderList = builder.authResourceHeaderList;
        this.domainId = builder.domainId;
        this.gatewayUniqueId = builder.gatewayUniqueId;
        this.ignoreCase = builder.ignoreCase;
        this.matchType = builder.matchType;
        this.path = builder.path;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AddAuthResourceRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return acceptLanguage
     */
    public String getAcceptLanguage() {
        return this.acceptLanguage;
    }

    /**
     * @return authId
     */
    public Long getAuthId() {
        return this.authId;
    }

    /**
     * @return authResourceHeaderList
     */
    public java.util.List < AuthResourceHeaderList> getAuthResourceHeaderList() {
        return this.authResourceHeaderList;
    }

    /**
     * @return domainId
     */
    public Long getDomainId() {
        return this.domainId;
    }

    /**
     * @return gatewayUniqueId
     */
    public String getGatewayUniqueId() {
        return this.gatewayUniqueId;
    }

    /**
     * @return ignoreCase
     */
    public Boolean getIgnoreCase() {
        return this.ignoreCase;
    }

    /**
     * @return matchType
     */
    public String getMatchType() {
        return this.matchType;
    }

    /**
     * @return path
     */
    public String getPath() {
        return this.path;
    }

    public static final class Builder extends Request.Builder<AddAuthResourceRequest, Builder> {
        private String acceptLanguage; 
        private Long authId; 
        private java.util.List < AuthResourceHeaderList> authResourceHeaderList; 
        private Long domainId; 
        private String gatewayUniqueId; 
        private Boolean ignoreCase; 
        private String matchType; 
        private String path; 

        private Builder() {
            super();
        } 

        private Builder(AddAuthResourceRequest request) {
            super(request);
            this.acceptLanguage = request.acceptLanguage;
            this.authId = request.authId;
            this.authResourceHeaderList = request.authResourceHeaderList;
            this.domainId = request.domainId;
            this.gatewayUniqueId = request.gatewayUniqueId;
            this.ignoreCase = request.ignoreCase;
            this.matchType = request.matchType;
            this.path = request.path;
        } 

        /**
         * 返回结果显示的语言。取值：zh（默认值）：中文，en：英文
         */
        public Builder acceptLanguage(String acceptLanguage) {
            this.putQueryParameter("AcceptLanguage", acceptLanguage);
            this.acceptLanguage = acceptLanguage;
            return this;
        }

        /**
         * AuthId.
         */
        public Builder authId(Long authId) {
            this.putQueryParameter("AuthId", authId);
            this.authId = authId;
            return this;
        }

        /**
         * AuthResourceHeaderList.
         */
        public Builder authResourceHeaderList(java.util.List < AuthResourceHeaderList> authResourceHeaderList) {
            String authResourceHeaderListShrink = shrink(authResourceHeaderList, "AuthResourceHeaderList", "json");
            this.putQueryParameter("AuthResourceHeaderList", authResourceHeaderListShrink);
            this.authResourceHeaderList = authResourceHeaderList;
            return this;
        }

        /**
         * DomainId.
         */
        public Builder domainId(Long domainId) {
            this.putQueryParameter("DomainId", domainId);
            this.domainId = domainId;
            return this;
        }

        /**
         * GatewayUniqueId.
         */
        public Builder gatewayUniqueId(String gatewayUniqueId) {
            this.putQueryParameter("GatewayUniqueId", gatewayUniqueId);
            this.gatewayUniqueId = gatewayUniqueId;
            return this;
        }

        /**
         * IgnoreCase.
         */
        public Builder ignoreCase(Boolean ignoreCase) {
            this.putQueryParameter("IgnoreCase", ignoreCase);
            this.ignoreCase = ignoreCase;
            return this;
        }

        /**
         * MatchType.
         */
        public Builder matchType(String matchType) {
            this.putQueryParameter("MatchType", matchType);
            this.matchType = matchType;
            return this;
        }

        /**
         * Path.
         */
        public Builder path(String path) {
            this.putQueryParameter("Path", path);
            this.path = path;
            return this;
        }

        @Override
        public AddAuthResourceRequest build() {
            return new AddAuthResourceRequest(this);
        } 

    } 

    public static class AuthResourceHeaderList extends TeaModel {
        @NameInMap("HeaderKey")
        private String headerKey;

        @NameInMap("HeaderMethod")
        private String headerMethod;

        @NameInMap("HeaderValue")
        private String headerValue;

        private AuthResourceHeaderList(Builder builder) {
            this.headerKey = builder.headerKey;
            this.headerMethod = builder.headerMethod;
            this.headerValue = builder.headerValue;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AuthResourceHeaderList create() {
            return builder().build();
        }

        /**
         * @return headerKey
         */
        public String getHeaderKey() {
            return this.headerKey;
        }

        /**
         * @return headerMethod
         */
        public String getHeaderMethod() {
            return this.headerMethod;
        }

        /**
         * @return headerValue
         */
        public String getHeaderValue() {
            return this.headerValue;
        }

        public static final class Builder {
            private String headerKey; 
            private String headerMethod; 
            private String headerValue; 

            /**
             * HeaderKey.
             */
            public Builder headerKey(String headerKey) {
                this.headerKey = headerKey;
                return this;
            }

            /**
             * HeaderMethod.
             */
            public Builder headerMethod(String headerMethod) {
                this.headerMethod = headerMethod;
                return this;
            }

            /**
             * HeaderValue.
             */
            public Builder headerValue(String headerValue) {
                this.headerValue = headerValue;
                return this;
            }

            public AuthResourceHeaderList build() {
                return new AuthResourceHeaderList(this);
            } 

        } 

    }
}
