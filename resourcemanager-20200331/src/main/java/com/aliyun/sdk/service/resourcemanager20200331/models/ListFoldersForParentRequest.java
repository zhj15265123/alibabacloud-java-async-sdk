// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.resourcemanager20200331.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListFoldersForParentRequest} extends {@link RequestModel}
 *
 * <p>ListFoldersForParentRequest</p>
 */
public class ListFoldersForParentRequest extends Request {
    @Query
    @NameInMap("PageNumber")
    private Integer pageNumber;

    @Query
    @NameInMap("PageSize")
    private Integer pageSize;

    @Query
    @NameInMap("ParentFolderId")
    private String parentFolderId;

    @Query
    @NameInMap("QueryKeyword")
    private String queryKeyword;

    private ListFoldersForParentRequest(Builder builder) {
        super(builder);
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.parentFolderId = builder.parentFolderId;
        this.queryKeyword = builder.queryKeyword;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListFoldersForParentRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return pageNumber
     */
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return parentFolderId
     */
    public String getParentFolderId() {
        return this.parentFolderId;
    }

    /**
     * @return queryKeyword
     */
    public String getQueryKeyword() {
        return this.queryKeyword;
    }

    public static final class Builder extends Request.Builder<ListFoldersForParentRequest, Builder> {
        private Integer pageNumber; 
        private Integer pageSize; 
        private String parentFolderId; 
        private String queryKeyword; 

        private Builder() {
            super();
        } 

        private Builder(ListFoldersForParentRequest request) {
            super(request);
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.parentFolderId = request.parentFolderId;
            this.queryKeyword = request.queryKeyword;
        } 

        /**
         * The number of the page to return.
         * <p>
         * 
         * Pages start from page 1. Default value: 1.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.putQueryParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * The number of entries to return on each page.
         * <p>
         * 
         * Valid values: 1 to 100. Default value: 10.
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * The ID of the parent folder.
         * <p>
         * 
         * If you leave this parameter empty, the information of the first-level subfolders of the Root folder is queried.
         */
        public Builder parentFolderId(String parentFolderId) {
            this.putQueryParameter("ParentFolderId", parentFolderId);
            this.parentFolderId = parentFolderId;
            return this;
        }

        /**
         * The keyword used for the query, such as a folder name.
         * <p>
         * 
         * Fuzzy match is supported.
         */
        public Builder queryKeyword(String queryKeyword) {
            this.putQueryParameter("QueryKeyword", queryKeyword);
            this.queryKeyword = queryKeyword;
            return this;
        }

        @Override
        public ListFoldersForParentRequest build() {
            return new ListFoldersForParentRequest(this);
        } 

    } 

}
