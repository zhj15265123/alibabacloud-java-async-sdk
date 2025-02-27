// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeVulListRequest} extends {@link RequestModel}
 *
 * <p>DescribeVulListRequest</p>
 */
public class DescribeVulListRequest extends Request {
    @Query
    @NameInMap("AliasName")
    private String aliasName;

    @Query
    @NameInMap("AttachTypes")
    private String attachTypes;

    @Query
    @NameInMap("CurrentPage")
    private Integer currentPage;

    @Query
    @NameInMap("Dealed")
    private String dealed;

    @Query
    @NameInMap("GroupId")
    private String groupId;

    @Query
    @NameInMap("Lang")
    private String lang;

    @Query
    @NameInMap("Name")
    private String name;

    @Query
    @NameInMap("Necessity")
    private String necessity;

    @Query
    @NameInMap("NextToken")
    private String nextToken;

    @Query
    @NameInMap("PageSize")
    private Integer pageSize;

    @Query
    @NameInMap("Remark")
    private String remark;

    @Query
    @NameInMap("ResourceDirectoryAccountId")
    private Long resourceDirectoryAccountId;

    @Query
    @NameInMap("StatusList")
    private String statusList;

    @Query
    @NameInMap("Type")
    @Validation(required = true)
    private String type;

    @Query
    @NameInMap("UseNextToken")
    private Boolean useNextToken;

    @Query
    @NameInMap("Uuids")
    private String uuids;

    @Query
    @NameInMap("VpcInstanceIds")
    private String vpcInstanceIds;

    private DescribeVulListRequest(Builder builder) {
        super(builder);
        this.aliasName = builder.aliasName;
        this.attachTypes = builder.attachTypes;
        this.currentPage = builder.currentPage;
        this.dealed = builder.dealed;
        this.groupId = builder.groupId;
        this.lang = builder.lang;
        this.name = builder.name;
        this.necessity = builder.necessity;
        this.nextToken = builder.nextToken;
        this.pageSize = builder.pageSize;
        this.remark = builder.remark;
        this.resourceDirectoryAccountId = builder.resourceDirectoryAccountId;
        this.statusList = builder.statusList;
        this.type = builder.type;
        this.useNextToken = builder.useNextToken;
        this.uuids = builder.uuids;
        this.vpcInstanceIds = builder.vpcInstanceIds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeVulListRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return aliasName
     */
    public String getAliasName() {
        return this.aliasName;
    }

    /**
     * @return attachTypes
     */
    public String getAttachTypes() {
        return this.attachTypes;
    }

    /**
     * @return currentPage
     */
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    /**
     * @return dealed
     */
    public String getDealed() {
        return this.dealed;
    }

    /**
     * @return groupId
     */
    public String getGroupId() {
        return this.groupId;
    }

    /**
     * @return lang
     */
    public String getLang() {
        return this.lang;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return necessity
     */
    public String getNecessity() {
        return this.necessity;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return remark
     */
    public String getRemark() {
        return this.remark;
    }

    /**
     * @return resourceDirectoryAccountId
     */
    public Long getResourceDirectoryAccountId() {
        return this.resourceDirectoryAccountId;
    }

    /**
     * @return statusList
     */
    public String getStatusList() {
        return this.statusList;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    /**
     * @return useNextToken
     */
    public Boolean getUseNextToken() {
        return this.useNextToken;
    }

    /**
     * @return uuids
     */
    public String getUuids() {
        return this.uuids;
    }

    /**
     * @return vpcInstanceIds
     */
    public String getVpcInstanceIds() {
        return this.vpcInstanceIds;
    }

    public static final class Builder extends Request.Builder<DescribeVulListRequest, Builder> {
        private String aliasName; 
        private String attachTypes; 
        private Integer currentPage; 
        private String dealed; 
        private String groupId; 
        private String lang; 
        private String name; 
        private String necessity; 
        private String nextToken; 
        private Integer pageSize; 
        private String remark; 
        private Long resourceDirectoryAccountId; 
        private String statusList; 
        private String type; 
        private Boolean useNextToken; 
        private String uuids; 
        private String vpcInstanceIds; 

        private Builder() {
            super();
        } 

        private Builder(DescribeVulListRequest request) {
            super(request);
            this.aliasName = request.aliasName;
            this.attachTypes = request.attachTypes;
            this.currentPage = request.currentPage;
            this.dealed = request.dealed;
            this.groupId = request.groupId;
            this.lang = request.lang;
            this.name = request.name;
            this.necessity = request.necessity;
            this.nextToken = request.nextToken;
            this.pageSize = request.pageSize;
            this.remark = request.remark;
            this.resourceDirectoryAccountId = request.resourceDirectoryAccountId;
            this.statusList = request.statusList;
            this.type = request.type;
            this.useNextToken = request.useNextToken;
            this.uuids = request.uuids;
            this.vpcInstanceIds = request.vpcInstanceIds;
        } 

        /**
         * The name of the vulnerability.
         */
        public Builder aliasName(String aliasName) {
            this.putQueryParameter("AliasName", aliasName);
            this.aliasName = aliasName;
            return this;
        }

        /**
         * The additional type of the vulnerabilities. You need to specify this parameter when you query application vulnerabilities. Set the value to **sca**. If you set **Type** to **app**, you must specify this parameter.
         * <p>
         * 
         * > If you set this parameter to **sca**, application vulnerabilities and the vulnerabilities that are detected based on software component analysis are queried. If you do not specify this parameter, only application vulnerabilities are queried.
         */
        public Builder attachTypes(String attachTypes) {
            this.putQueryParameter("AttachTypes", attachTypes);
            this.attachTypes = attachTypes;
            return this;
        }

        /**
         * The number of the page to return. Default value: **1**.
         */
        public Builder currentPage(Integer currentPage) {
            this.putQueryParameter("CurrentPage", currentPage);
            this.currentPage = currentPage;
            return this;
        }

        /**
         * Specifies whether the vulnerabilities are fixed. Valid values:
         * <p>
         * 
         * *   **y**: yes
         * *   **n**: no
         */
        public Builder dealed(String dealed) {
            this.putQueryParameter("Dealed", dealed);
            this.dealed = dealed;
            return this;
        }

        /**
         * The ID of the asset group.
         * <p>
         * 
         * > You can call the [DescribeAllGroups](~~DescribeAllGroups~~) operation to query the IDs of asset groups.
         */
        public Builder groupId(String groupId) {
            this.putQueryParameter("GroupId", groupId);
            this.groupId = groupId;
            return this;
        }

        /**
         * The language of the content within the request and response. Default value: **zh**. Valid values:
         * <p>
         * 
         * *   **zh**: Chinese
         * *   **en**: English
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * The alias of the vulnerability.
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * The priority to fix the vulnerability. Separate multiple priorities with commas (,). Valid values:
         * <p>
         * 
         * *   **asap**: high
         * *   **later**: medium
         * *   **nntf**: low
         */
        public Builder necessity(String necessity) {
            this.putQueryParameter("Necessity", necessity);
            this.necessity = necessity;
            return this;
        }

        /**
         * NextToken.
         */
        public Builder nextToken(String nextToken) {
            this.putQueryParameter("NextToken", nextToken);
            this.nextToken = nextToken;
            return this;
        }

        /**
         * The number of entries per page. Default value: **10**.
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * The remarks for the asset affected by the vulnerability. The value can be the private IP address, public IP address, or name of the asset.
         */
        public Builder remark(String remark) {
            this.putQueryParameter("Remark", remark);
            this.remark = remark;
            return this;
        }

        /**
         * ResourceDirectoryAccountId.
         */
        public Builder resourceDirectoryAccountId(Long resourceDirectoryAccountId) {
            this.putQueryParameter("ResourceDirectoryAccountId", resourceDirectoryAccountId);
            this.resourceDirectoryAccountId = resourceDirectoryAccountId;
            return this;
        }

        /**
         * StatusList.
         */
        public Builder statusList(String statusList) {
            this.putQueryParameter("StatusList", statusList);
            this.statusList = statusList;
            return this;
        }

        /**
         * The type of the vulnerability. Valid values:
         * <p>
         * 
         * *   **cve**: Linux software vulnerability
         * *   **sys**: Windows system vulnerability
         * *   **cms**: Web-CMS vulnerability.
         * *   **app**: application vulnerability that is detected by using web scanner
         * *   **emg**: urgent vulnerability.
         * *   **sca**: application vulnerability that is detected by using software component analysis
         */
        public Builder type(String type) {
            this.putQueryParameter("Type", type);
            this.type = type;
            return this;
        }

        /**
         * UseNextToken.
         */
        public Builder useNextToken(Boolean useNextToken) {
            this.putQueryParameter("UseNextToken", useNextToken);
            this.useNextToken = useNextToken;
            return this;
        }

        /**
         * The UUIDs of the servers on which you want to query the vulnerabilities. Separate multiple UUIDs with commas (,).
         */
        public Builder uuids(String uuids) {
            this.putQueryParameter("Uuids", uuids);
            this.uuids = uuids;
            return this;
        }

        /**
         * The ID of the virtual private cloud (VPC) in which the vulnerabilities are detected. Separate multiple IDs with commas (,).
         */
        public Builder vpcInstanceIds(String vpcInstanceIds) {
            this.putQueryParameter("VpcInstanceIds", vpcInstanceIds);
            this.vpcInstanceIds = vpcInstanceIds;
            return this;
        }

        @Override
        public DescribeVulListRequest build() {
            return new DescribeVulListRequest(this);
        } 

    } 

}
