// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.devops20210625.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListRepositoriesRequest} extends {@link RequestModel}
 *
 * <p>ListRepositoriesRequest</p>
 */
public class ListRepositoriesRequest extends Request {
    @Query
    @NameInMap("accessToken")
    private String accessToken;

    @Query
    @NameInMap("archived")
    private Boolean archived;

    @Query
    @NameInMap("orderBy")
    private String orderBy;

    @Query
    @NameInMap("organizationId")
    @Validation(required = true)
    private String organizationId;

    @Query
    @NameInMap("page")
    private Long page;

    @Query
    @NameInMap("perPage")
    private Long perPage;

    @Query
    @NameInMap("search")
    private String search;

    @Query
    @NameInMap("sort")
    private String sort;

    private ListRepositoriesRequest(Builder builder) {
        super(builder);
        this.accessToken = builder.accessToken;
        this.archived = builder.archived;
        this.orderBy = builder.orderBy;
        this.organizationId = builder.organizationId;
        this.page = builder.page;
        this.perPage = builder.perPage;
        this.search = builder.search;
        this.sort = builder.sort;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListRepositoriesRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return accessToken
     */
    public String getAccessToken() {
        return this.accessToken;
    }

    /**
     * @return archived
     */
    public Boolean getArchived() {
        return this.archived;
    }

    /**
     * @return orderBy
     */
    public String getOrderBy() {
        return this.orderBy;
    }

    /**
     * @return organizationId
     */
    public String getOrganizationId() {
        return this.organizationId;
    }

    /**
     * @return page
     */
    public Long getPage() {
        return this.page;
    }

    /**
     * @return perPage
     */
    public Long getPerPage() {
        return this.perPage;
    }

    /**
     * @return search
     */
    public String getSearch() {
        return this.search;
    }

    /**
     * @return sort
     */
    public String getSort() {
        return this.sort;
    }

    public static final class Builder extends Request.Builder<ListRepositoriesRequest, Builder> {
        private String accessToken; 
        private Boolean archived; 
        private String orderBy; 
        private String organizationId; 
        private Long page; 
        private Long perPage; 
        private String search; 
        private String sort; 

        private Builder() {
            super();
        } 

        private Builder(ListRepositoriesRequest request) {
            super(request);
            this.accessToken = request.accessToken;
            this.archived = request.archived;
            this.orderBy = request.orderBy;
            this.organizationId = request.organizationId;
            this.page = request.page;
            this.perPage = request.perPage;
            this.search = request.search;
            this.sort = request.sort;
        } 

        /**
         * accessToken.
         */
        public Builder accessToken(String accessToken) {
            this.putQueryParameter("accessToken", accessToken);
            this.accessToken = accessToken;
            return this;
        }

        /**
         * archived.
         */
        public Builder archived(Boolean archived) {
            this.putQueryParameter("archived", archived);
            this.archived = archived;
            return this;
        }

        /**
         * orderBy.
         */
        public Builder orderBy(String orderBy) {
            this.putQueryParameter("orderBy", orderBy);
            this.orderBy = orderBy;
            return this;
        }

        /**
         * organizationId.
         */
        public Builder organizationId(String organizationId) {
            this.putQueryParameter("organizationId", organizationId);
            this.organizationId = organizationId;
            return this;
        }

        /**
         * page.
         */
        public Builder page(Long page) {
            this.putQueryParameter("page", page);
            this.page = page;
            return this;
        }

        /**
         * perPage.
         */
        public Builder perPage(Long perPage) {
            this.putQueryParameter("perPage", perPage);
            this.perPage = perPage;
            return this;
        }

        /**
         * search.
         */
        public Builder search(String search) {
            this.putQueryParameter("search", search);
            this.search = search;
            return this;
        }

        /**
         * sort.
         */
        public Builder sort(String sort) {
            this.putQueryParameter("sort", sort);
            this.sort = sort;
            return this;
        }

        @Override
        public ListRepositoriesRequest build() {
            return new ListRepositoriesRequest(this);
        } 

    } 

}
