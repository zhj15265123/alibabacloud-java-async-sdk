// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alidns20150109.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AddDomainGroupRequest} extends {@link RequestModel}
 *
 * <p>AddDomainGroupRequest</p>
 */
public class AddDomainGroupRequest extends Request {
    @Query
    @NameInMap("GroupName")
    @Validation(required = true)
    private String groupName;

    @Query
    @NameInMap("Lang")
    private String lang;

    private AddDomainGroupRequest(Builder builder) {
        super(builder);
        this.groupName = builder.groupName;
        this.lang = builder.lang;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AddDomainGroupRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return groupName
     */
    public String getGroupName() {
        return this.groupName;
    }

    /**
     * @return lang
     */
    public String getLang() {
        return this.lang;
    }

    public static final class Builder extends Request.Builder<AddDomainGroupRequest, Builder> {
        private String groupName; 
        private String lang; 

        private Builder() {
            super();
        } 

        private Builder(AddDomainGroupRequest request) {
            super(request);
            this.groupName = request.groupName;
            this.lang = request.lang;
        } 

        /**
         * The ID of the request.
         */
        public Builder groupName(String groupName) {
            this.putQueryParameter("GroupName", groupName);
            this.groupName = groupName;
            return this;
        }

        /**
         * The name of the domain name group.
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        @Override
        public AddDomainGroupRequest build() {
            return new AddDomainGroupRequest(this);
        } 

    } 

}
