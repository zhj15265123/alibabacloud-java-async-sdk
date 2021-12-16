// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

/**
 * {@link ListSavedSearchResponseBody} extends {@link TeaModel}
 *
 * <p>ListSavedSearchResponseBody</p>
 */
public class ListSavedSearchResponseBody extends TeaModel {
    @NameInMap("count")
    private Integer count;

    @NameInMap("savedsearchItems")
    private java.util.List < SavedSearch > savedsearchItems;

    @NameInMap("total")
    private Integer total;


    private ListSavedSearchResponseBody(Builder builder) {
        this.count = builder.count;
        this.savedsearchItems = builder.savedsearchItems;
        this.total = builder.total;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListSavedSearchResponseBody create() {
        return builder().build();
    }

    /**
     * @return count
     */
    public Integer getCount() {
        return this.count;
    }

    /**
     * @return savedsearchItems
     */
    public java.util.List < SavedSearch > getSavedsearchItems() {
        return this.savedsearchItems;
    }

    /**
     * @return total
     */
    public Integer getTotal() {
        return this.total;
    }

    public static final class Builder {
        private Integer count; 
        private java.util.List < SavedSearch > savedsearchItems; 
        private Integer total; 

        /**
         * <p>count.</p>
         */
        public Builder count(Integer count) {
            this.count = count;
            return this;
        }

        /**
         * <p>savedsearchItems.</p>
         */
        public Builder savedsearchItems(java.util.List < SavedSearch > savedsearchItems) {
            this.savedsearchItems = savedsearchItems;
            return this;
        }

        /**
         * <p>total.</p>
         */
        public Builder total(Integer total) {
            this.total = total;
            return this;
        }

        public ListSavedSearchResponseBody build() {
            return new ListSavedSearchResponseBody(this);
        } 

    } 

}
