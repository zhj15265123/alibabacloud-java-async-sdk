// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dds20151201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeGlobalSecurityIPGroupResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeGlobalSecurityIPGroupResponseBody</p>
 */
public class DescribeGlobalSecurityIPGroupResponseBody extends TeaModel {
    @NameInMap("GlobalSecurityIPGroup")
    private java.util.List < GlobalSecurityIPGroup> globalSecurityIPGroup;

    @NameInMap("RequestId")
    private String requestId;

    private DescribeGlobalSecurityIPGroupResponseBody(Builder builder) {
        this.globalSecurityIPGroup = builder.globalSecurityIPGroup;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeGlobalSecurityIPGroupResponseBody create() {
        return builder().build();
    }

    /**
     * @return globalSecurityIPGroup
     */
    public java.util.List < GlobalSecurityIPGroup> getGlobalSecurityIPGroup() {
        return this.globalSecurityIPGroup;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List < GlobalSecurityIPGroup> globalSecurityIPGroup; 
        private String requestId; 

        /**
         * GlobalSecurityIPGroup.
         */
        public Builder globalSecurityIPGroup(java.util.List < GlobalSecurityIPGroup> globalSecurityIPGroup) {
            this.globalSecurityIPGroup = globalSecurityIPGroup;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeGlobalSecurityIPGroupResponseBody build() {
            return new DescribeGlobalSecurityIPGroupResponseBody(this);
        } 

    } 

    public static class GlobalSecurityIPGroup extends TeaModel {
        @NameInMap("DBInstances")
        private java.util.List < String > DBInstances;

        @NameInMap("GIpList")
        private String gIpList;

        @NameInMap("GlobalIgName")
        private String globalIgName;

        @NameInMap("GlobalSecurityGroupId")
        private String globalSecurityGroupId;

        @NameInMap("RegionId")
        private String regionId;

        private GlobalSecurityIPGroup(Builder builder) {
            this.DBInstances = builder.DBInstances;
            this.gIpList = builder.gIpList;
            this.globalIgName = builder.globalIgName;
            this.globalSecurityGroupId = builder.globalSecurityGroupId;
            this.regionId = builder.regionId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static GlobalSecurityIPGroup create() {
            return builder().build();
        }

        /**
         * @return DBInstances
         */
        public java.util.List < String > getDBInstances() {
            return this.DBInstances;
        }

        /**
         * @return gIpList
         */
        public String getGIpList() {
            return this.gIpList;
        }

        /**
         * @return globalIgName
         */
        public String getGlobalIgName() {
            return this.globalIgName;
        }

        /**
         * @return globalSecurityGroupId
         */
        public String getGlobalSecurityGroupId() {
            return this.globalSecurityGroupId;
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        public static final class Builder {
            private java.util.List < String > DBInstances; 
            private String gIpList; 
            private String globalIgName; 
            private String globalSecurityGroupId; 
            private String regionId; 

            /**
             * DBInstances.
             */
            public Builder DBInstances(java.util.List < String > DBInstances) {
                this.DBInstances = DBInstances;
                return this;
            }

            /**
             * GIpList.
             */
            public Builder gIpList(String gIpList) {
                this.gIpList = gIpList;
                return this;
            }

            /**
             * GlobalIgName.
             */
            public Builder globalIgName(String globalIgName) {
                this.globalIgName = globalIgName;
                return this;
            }

            /**
             * GlobalSecurityGroupId.
             */
            public Builder globalSecurityGroupId(String globalSecurityGroupId) {
                this.globalSecurityGroupId = globalSecurityGroupId;
                return this;
            }

            /**
             * RegionId.
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            public GlobalSecurityIPGroup build() {
                return new GlobalSecurityIPGroup(this);
            } 

        } 

    }
}
