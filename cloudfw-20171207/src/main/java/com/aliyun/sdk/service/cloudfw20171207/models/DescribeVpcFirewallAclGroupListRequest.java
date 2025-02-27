// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudfw20171207.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeVpcFirewallAclGroupListRequest} extends {@link RequestModel}
 *
 * <p>DescribeVpcFirewallAclGroupListRequest</p>
 */
public class DescribeVpcFirewallAclGroupListRequest extends Request {
    @Query
    @NameInMap("CurrentPage")
    private String currentPage;

    @Query
    @NameInMap("FirewallConfigureStatus")
    private String firewallConfigureStatus;

    @Query
    @NameInMap("Lang")
    private String lang;

    @Query
    @NameInMap("PageSize")
    private String pageSize;

    private DescribeVpcFirewallAclGroupListRequest(Builder builder) {
        super(builder);
        this.currentPage = builder.currentPage;
        this.firewallConfigureStatus = builder.firewallConfigureStatus;
        this.lang = builder.lang;
        this.pageSize = builder.pageSize;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeVpcFirewallAclGroupListRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return currentPage
     */
    public String getCurrentPage() {
        return this.currentPage;
    }

    /**
     * @return firewallConfigureStatus
     */
    public String getFirewallConfigureStatus() {
        return this.firewallConfigureStatus;
    }

    /**
     * @return lang
     */
    public String getLang() {
        return this.lang;
    }

    /**
     * @return pageSize
     */
    public String getPageSize() {
        return this.pageSize;
    }

    public static final class Builder extends Request.Builder<DescribeVpcFirewallAclGroupListRequest, Builder> {
        private String currentPage; 
        private String firewallConfigureStatus; 
        private String lang; 
        private String pageSize; 

        private Builder() {
            super();
        } 

        private Builder(DescribeVpcFirewallAclGroupListRequest request) {
            super(request);
            this.currentPage = request.currentPage;
            this.firewallConfigureStatus = request.firewallConfigureStatus;
            this.lang = request.lang;
            this.pageSize = request.pageSize;
        } 

        /**
         * The number of the page to return. Default value: 1.
         */
        public Builder currentPage(String currentPage) {
            this.putQueryParameter("CurrentPage", currentPage);
            this.currentPage = currentPage;
            return this;
        }

        /**
         * Specifies whether VPC firewalls are configured. Valid values:
         * <p>
         * 
         * *   **notconfigured**: VPC firewalls are not configured.
         * *   **configured**: VPC firewalls are configured.
         * *   If this parameter is left empty, all policy groups of access control policies are queried.
         */
        public Builder firewallConfigureStatus(String firewallConfigureStatus) {
            this.putQueryParameter("FirewallConfigureStatus", firewallConfigureStatus);
            this.firewallConfigureStatus = firewallConfigureStatus;
            return this;
        }

        /**
         * The language of the content within the response. Valid values:
         * <p>
         * 
         * *   **zh**: Chinese (default)
         * *   **en**: English
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * The number of entries to return on each page. Maximum value: 50.
         */
        public Builder pageSize(String pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        @Override
        public DescribeVpcFirewallAclGroupListRequest build() {
            return new DescribeVpcFirewallAclGroupListRequest(this);
        } 

    } 

}
