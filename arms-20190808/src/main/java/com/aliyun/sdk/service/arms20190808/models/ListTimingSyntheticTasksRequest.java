// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20190808.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListTimingSyntheticTasksRequest} extends {@link RequestModel}
 *
 * <p>ListTimingSyntheticTasksRequest</p>
 */
public class ListTimingSyntheticTasksRequest extends Request {
    @Query
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("ResourceGroupId")
    private String resourceGroupId;

    @Query
    @NameInMap("Search")
    private Search search;

    @Query
    @NameInMap("Tags")
    private java.util.List < Tags> tags;

    private ListTimingSyntheticTasksRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.resourceGroupId = builder.resourceGroupId;
        this.search = builder.search;
        this.tags = builder.tags;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListTimingSyntheticTasksRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return resourceGroupId
     */
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    /**
     * @return search
     */
    public Search getSearch() {
        return this.search;
    }

    /**
     * @return tags
     */
    public java.util.List < Tags> getTags() {
        return this.tags;
    }

    public static final class Builder extends Request.Builder<ListTimingSyntheticTasksRequest, Builder> {
        private String regionId; 
        private String resourceGroupId; 
        private Search search; 
        private java.util.List < Tags> tags; 

        private Builder() {
            super();
        } 

        private Builder(ListTimingSyntheticTasksRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.resourceGroupId = request.resourceGroupId;
            this.search = request.search;
            this.tags = request.tags;
        } 

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * ResourceGroupId.
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.putQueryParameter("ResourceGroupId", resourceGroupId);
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * Search.
         */
        public Builder search(Search search) {
            String searchShrink = shrink(search, "Search", "json");
            this.putQueryParameter("Search", searchShrink);
            this.search = search;
            return this;
        }

        /**
         * Tags.
         */
        public Builder tags(java.util.List < Tags> tags) {
            String tagsShrink = shrink(tags, "Tags", "json");
            this.putQueryParameter("Tags", tagsShrink);
            this.tags = tags;
            return this;
        }

        @Override
        public ListTimingSyntheticTasksRequest build() {
            return new ListTimingSyntheticTasksRequest(this);
        } 

    } 

    public static class Search extends TeaModel {
        @NameInMap("Name")
        private String name;

        @NameInMap("Order")
        private Integer order;

        @NameInMap("OrderField")
        private String orderField;

        @NameInMap("Page")
        private Integer page;

        @NameInMap("PageSize")
        private Integer pageSize;

        @NameInMap("Status")
        private String status;

        @NameInMap("TaskIds")
        private java.util.List < String > taskIds;

        @NameInMap("TaskTypes")
        private java.util.List < Integer > taskTypes;

        private Search(Builder builder) {
            this.name = builder.name;
            this.order = builder.order;
            this.orderField = builder.orderField;
            this.page = builder.page;
            this.pageSize = builder.pageSize;
            this.status = builder.status;
            this.taskIds = builder.taskIds;
            this.taskTypes = builder.taskTypes;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Search create() {
            return builder().build();
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return order
         */
        public Integer getOrder() {
            return this.order;
        }

        /**
         * @return orderField
         */
        public String getOrderField() {
            return this.orderField;
        }

        /**
         * @return page
         */
        public Integer getPage() {
            return this.page;
        }

        /**
         * @return pageSize
         */
        public Integer getPageSize() {
            return this.pageSize;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return taskIds
         */
        public java.util.List < String > getTaskIds() {
            return this.taskIds;
        }

        /**
         * @return taskTypes
         */
        public java.util.List < Integer > getTaskTypes() {
            return this.taskTypes;
        }

        public static final class Builder {
            private String name; 
            private Integer order; 
            private String orderField; 
            private Integer page; 
            private Integer pageSize; 
            private String status; 
            private java.util.List < String > taskIds; 
            private java.util.List < Integer > taskTypes; 

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * Order.
             */
            public Builder order(Integer order) {
                this.order = order;
                return this;
            }

            /**
             * OrderField.
             */
            public Builder orderField(String orderField) {
                this.orderField = orderField;
                return this;
            }

            /**
             * Page.
             */
            public Builder page(Integer page) {
                this.page = page;
                return this;
            }

            /**
             * PageSize.
             */
            public Builder pageSize(Integer pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * TaskIds.
             */
            public Builder taskIds(java.util.List < String > taskIds) {
                this.taskIds = taskIds;
                return this;
            }

            /**
             * TaskTypes.
             */
            public Builder taskTypes(java.util.List < Integer > taskTypes) {
                this.taskTypes = taskTypes;
                return this;
            }

            public Search build() {
                return new Search(this);
            } 

        } 

    }
    public static class Tags extends TeaModel {
        @NameInMap("Key")
        private String key;

        @NameInMap("Value")
        private String value;

        private Tags(Builder builder) {
            this.key = builder.key;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tags create() {
            return builder().build();
        }

        /**
         * @return key
         */
        public String getKey() {
            return this.key;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String key; 
            private String value; 

            /**
             * Key.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * Value.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public Tags build() {
                return new Tags(this);
            } 

        } 

    }
}
