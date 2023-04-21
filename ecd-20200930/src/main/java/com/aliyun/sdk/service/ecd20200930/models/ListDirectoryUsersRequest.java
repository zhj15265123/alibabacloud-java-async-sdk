// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20200930.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListDirectoryUsersRequest} extends {@link RequestModel}
 *
 * <p>ListDirectoryUsersRequest</p>
 */
public class ListDirectoryUsersRequest extends Request {
    @Query
    @NameInMap("DirectoryId")
    @Validation(required = true)
    private String directoryId;

    @Query
    @NameInMap("Filter")
    private String filter;

    @Query
    @NameInMap("MaxResults")
    private Integer maxResults;

    @Query
    @NameInMap("NextToken")
    private String nextToken;

    @Query
    @NameInMap("OUPath")
    private String OUPath;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    private ListDirectoryUsersRequest(Builder builder) {
        super(builder);
        this.directoryId = builder.directoryId;
        this.filter = builder.filter;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.OUPath = builder.OUPath;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListDirectoryUsersRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return directoryId
     */
    public String getDirectoryId() {
        return this.directoryId;
    }

    /**
     * @return filter
     */
    public String getFilter() {
        return this.filter;
    }

    /**
     * @return maxResults
     */
    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * @return OUPath
     */
    public String getOUPath() {
        return this.OUPath;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<ListDirectoryUsersRequest, Builder> {
        private String directoryId; 
        private String filter; 
        private Integer maxResults; 
        private String nextToken; 
        private String OUPath; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(ListDirectoryUsersRequest request) {
            super(request);
            this.directoryId = request.directoryId;
            this.filter = request.filter;
            this.maxResults = request.maxResults;
            this.nextToken = request.nextToken;
            this.OUPath = request.OUPath;
            this.regionId = request.regionId;
        } 

        /**
         * The ID of the AD directory.
         */
        public Builder directoryId(String directoryId) {
            this.putQueryParameter("DirectoryId", directoryId);
            this.directoryId = directoryId;
            return this;
        }

        /**
         * The query string for fuzzy query. If you specify this parameter, the system returns all results that contain the string.
         */
        public Builder filter(String filter) {
            this.putQueryParameter("Filter", filter);
            this.filter = filter;
            return this;
        }

        /**
         * The number of entries to return on each page.
         * <p>
         * 
         * *   Maximum value: 100
         * *   Default value: 10
         */
        public Builder maxResults(Integer maxResults) {
            this.putQueryParameter("MaxResults", maxResults);
            this.maxResults = maxResults;
            return this;
        }

        /**
         * The token that determines the start point of the next query. If this parameter is left empty, all results are returned.
         */
        public Builder nextToken(String nextToken) {
            this.putQueryParameter("NextToken", nextToken);
            this.nextToken = nextToken;
            return this;
        }

        /**
         * The organizational unit (OU) of the AD domain to which users belong. You can call the [ListUserAdOrganizationUnits](~~311259~~) operation to obtain the OU.
         */
        public Builder OUPath(String OUPath) {
            this.putQueryParameter("OUPath", OUPath);
            this.OUPath = OUPath;
            return this;
        }

        /**
         * The ID of the region.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public ListDirectoryUsersRequest build() {
            return new ListDirectoryUsersRequest(this);
        } 

    } 

}
