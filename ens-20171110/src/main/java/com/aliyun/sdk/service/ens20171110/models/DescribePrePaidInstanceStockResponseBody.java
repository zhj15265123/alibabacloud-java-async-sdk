// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribePrePaidInstanceStockResponseBody} extends {@link TeaModel}
 *
 * <p>DescribePrePaidInstanceStockResponseBody</p>
 */
public class DescribePrePaidInstanceStockResponseBody extends TeaModel {
    @NameInMap("AvaliableCount")
    private Integer avaliableCount;

    @NameInMap("Cores")
    private Integer cores;

    @NameInMap("DataDiskSize")
    private Integer dataDiskSize;

    @NameInMap("EnsRegionId")
    private String ensRegionId;

    @NameInMap("InstanceSpec")
    private String instanceSpec;

    @NameInMap("Memory")
    private Integer memory;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("ResourceGap")
    private String resourceGap;

    @NameInMap("SystemDiskSize")
    private Integer systemDiskSize;

    private DescribePrePaidInstanceStockResponseBody(Builder builder) {
        this.avaliableCount = builder.avaliableCount;
        this.cores = builder.cores;
        this.dataDiskSize = builder.dataDiskSize;
        this.ensRegionId = builder.ensRegionId;
        this.instanceSpec = builder.instanceSpec;
        this.memory = builder.memory;
        this.requestId = builder.requestId;
        this.resourceGap = builder.resourceGap;
        this.systemDiskSize = builder.systemDiskSize;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribePrePaidInstanceStockResponseBody create() {
        return builder().build();
    }

    /**
     * @return avaliableCount
     */
    public Integer getAvaliableCount() {
        return this.avaliableCount;
    }

    /**
     * @return cores
     */
    public Integer getCores() {
        return this.cores;
    }

    /**
     * @return dataDiskSize
     */
    public Integer getDataDiskSize() {
        return this.dataDiskSize;
    }

    /**
     * @return ensRegionId
     */
    public String getEnsRegionId() {
        return this.ensRegionId;
    }

    /**
     * @return instanceSpec
     */
    public String getInstanceSpec() {
        return this.instanceSpec;
    }

    /**
     * @return memory
     */
    public Integer getMemory() {
        return this.memory;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return resourceGap
     */
    public String getResourceGap() {
        return this.resourceGap;
    }

    /**
     * @return systemDiskSize
     */
    public Integer getSystemDiskSize() {
        return this.systemDiskSize;
    }

    public static final class Builder {
        private Integer avaliableCount; 
        private Integer cores; 
        private Integer dataDiskSize; 
        private String ensRegionId; 
        private String instanceSpec; 
        private Integer memory; 
        private String requestId; 
        private String resourceGap; 
        private Integer systemDiskSize; 

        /**
         * AvaliableCount.
         */
        public Builder avaliableCount(Integer avaliableCount) {
            this.avaliableCount = avaliableCount;
            return this;
        }

        /**
         * Cores.
         */
        public Builder cores(Integer cores) {
            this.cores = cores;
            return this;
        }

        /**
         * DataDiskSize.
         */
        public Builder dataDiskSize(Integer dataDiskSize) {
            this.dataDiskSize = dataDiskSize;
            return this;
        }

        /**
         * EnsRegionId.
         */
        public Builder ensRegionId(String ensRegionId) {
            this.ensRegionId = ensRegionId;
            return this;
        }

        /**
         * InstanceSpec.
         */
        public Builder instanceSpec(String instanceSpec) {
            this.instanceSpec = instanceSpec;
            return this;
        }

        /**
         * Memory.
         */
        public Builder memory(Integer memory) {
            this.memory = memory;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * ResourceGap.
         */
        public Builder resourceGap(String resourceGap) {
            this.resourceGap = resourceGap;
            return this;
        }

        /**
         * SystemDiskSize.
         */
        public Builder systemDiskSize(Integer systemDiskSize) {
            this.systemDiskSize = systemDiskSize;
            return this;
        }

        public DescribePrePaidInstanceStockResponseBody build() {
            return new DescribePrePaidInstanceStockResponseBody(this);
        } 

    } 

}
