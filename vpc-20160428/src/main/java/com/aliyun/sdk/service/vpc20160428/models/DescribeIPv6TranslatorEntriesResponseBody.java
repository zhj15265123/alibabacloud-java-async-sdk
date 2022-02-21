// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpc20160428.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeIPv6TranslatorEntriesResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeIPv6TranslatorEntriesResponseBody</p>
 */
public class DescribeIPv6TranslatorEntriesResponseBody extends TeaModel {
    @NameInMap("Ipv6TranslatorEntries")
    private Ipv6TranslatorEntries ipv6TranslatorEntries;

    @NameInMap("PageNumber")
    private Integer pageNumber;

    @NameInMap("PageSize")
    private Integer pageSize;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalCount")
    private Integer totalCount;

    private DescribeIPv6TranslatorEntriesResponseBody(Builder builder) {
        this.ipv6TranslatorEntries = builder.ipv6TranslatorEntries;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeIPv6TranslatorEntriesResponseBody create() {
        return builder().build();
    }

    /**
     * @return ipv6TranslatorEntries
     */
    public Ipv6TranslatorEntries getIpv6TranslatorEntries() {
        return this.ipv6TranslatorEntries;
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
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private Ipv6TranslatorEntries ipv6TranslatorEntries; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private Integer totalCount; 

        /**
         * Ipv6TranslatorEntries.
         */
        public Builder ipv6TranslatorEntries(Ipv6TranslatorEntries ipv6TranslatorEntries) {
            this.ipv6TranslatorEntries = ipv6TranslatorEntries;
            return this;
        }

        /**
         * PageNumber.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
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
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * TotalCount.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeIPv6TranslatorEntriesResponseBody build() {
            return new DescribeIPv6TranslatorEntriesResponseBody(this);
        } 

    } 

    public static class Ipv6TranslatorEntry extends TeaModel {
        @NameInMap("AclId")
        private String aclId;

        @NameInMap("AclStatus")
        private String aclStatus;

        @NameInMap("AclType")
        private String aclType;

        @NameInMap("AllocateIpv6Addr")
        private String allocateIpv6Addr;

        @NameInMap("AllocateIpv6Port")
        private Integer allocateIpv6Port;

        @NameInMap("BackendIpv4Addr")
        private String backendIpv4Addr;

        @NameInMap("BackendIpv4Port")
        private String backendIpv4Port;

        @NameInMap("EntryBandwidth")
        private String entryBandwidth;

        @NameInMap("EntryDescription")
        private String entryDescription;

        @NameInMap("EntryName")
        private String entryName;

        @NameInMap("EntryStatus")
        private String entryStatus;

        @NameInMap("Ipv6TranslatorEntryId")
        private String ipv6TranslatorEntryId;

        @NameInMap("Ipv6TranslatorId")
        private String ipv6TranslatorId;

        @NameInMap("RegionId")
        private String regionId;

        @NameInMap("TransProtocol")
        private String transProtocol;

        private Ipv6TranslatorEntry(Builder builder) {
            this.aclId = builder.aclId;
            this.aclStatus = builder.aclStatus;
            this.aclType = builder.aclType;
            this.allocateIpv6Addr = builder.allocateIpv6Addr;
            this.allocateIpv6Port = builder.allocateIpv6Port;
            this.backendIpv4Addr = builder.backendIpv4Addr;
            this.backendIpv4Port = builder.backendIpv4Port;
            this.entryBandwidth = builder.entryBandwidth;
            this.entryDescription = builder.entryDescription;
            this.entryName = builder.entryName;
            this.entryStatus = builder.entryStatus;
            this.ipv6TranslatorEntryId = builder.ipv6TranslatorEntryId;
            this.ipv6TranslatorId = builder.ipv6TranslatorId;
            this.regionId = builder.regionId;
            this.transProtocol = builder.transProtocol;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Ipv6TranslatorEntry create() {
            return builder().build();
        }

        /**
         * @return aclId
         */
        public String getAclId() {
            return this.aclId;
        }

        /**
         * @return aclStatus
         */
        public String getAclStatus() {
            return this.aclStatus;
        }

        /**
         * @return aclType
         */
        public String getAclType() {
            return this.aclType;
        }

        /**
         * @return allocateIpv6Addr
         */
        public String getAllocateIpv6Addr() {
            return this.allocateIpv6Addr;
        }

        /**
         * @return allocateIpv6Port
         */
        public Integer getAllocateIpv6Port() {
            return this.allocateIpv6Port;
        }

        /**
         * @return backendIpv4Addr
         */
        public String getBackendIpv4Addr() {
            return this.backendIpv4Addr;
        }

        /**
         * @return backendIpv4Port
         */
        public String getBackendIpv4Port() {
            return this.backendIpv4Port;
        }

        /**
         * @return entryBandwidth
         */
        public String getEntryBandwidth() {
            return this.entryBandwidth;
        }

        /**
         * @return entryDescription
         */
        public String getEntryDescription() {
            return this.entryDescription;
        }

        /**
         * @return entryName
         */
        public String getEntryName() {
            return this.entryName;
        }

        /**
         * @return entryStatus
         */
        public String getEntryStatus() {
            return this.entryStatus;
        }

        /**
         * @return ipv6TranslatorEntryId
         */
        public String getIpv6TranslatorEntryId() {
            return this.ipv6TranslatorEntryId;
        }

        /**
         * @return ipv6TranslatorId
         */
        public String getIpv6TranslatorId() {
            return this.ipv6TranslatorId;
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        /**
         * @return transProtocol
         */
        public String getTransProtocol() {
            return this.transProtocol;
        }

        public static final class Builder {
            private String aclId; 
            private String aclStatus; 
            private String aclType; 
            private String allocateIpv6Addr; 
            private Integer allocateIpv6Port; 
            private String backendIpv4Addr; 
            private String backendIpv4Port; 
            private String entryBandwidth; 
            private String entryDescription; 
            private String entryName; 
            private String entryStatus; 
            private String ipv6TranslatorEntryId; 
            private String ipv6TranslatorId; 
            private String regionId; 
            private String transProtocol; 

            /**
             * AclId.
             */
            public Builder aclId(String aclId) {
                this.aclId = aclId;
                return this;
            }

            /**
             * AclStatus.
             */
            public Builder aclStatus(String aclStatus) {
                this.aclStatus = aclStatus;
                return this;
            }

            /**
             * AclType.
             */
            public Builder aclType(String aclType) {
                this.aclType = aclType;
                return this;
            }

            /**
             * AllocateIpv6Addr.
             */
            public Builder allocateIpv6Addr(String allocateIpv6Addr) {
                this.allocateIpv6Addr = allocateIpv6Addr;
                return this;
            }

            /**
             * AllocateIpv6Port.
             */
            public Builder allocateIpv6Port(Integer allocateIpv6Port) {
                this.allocateIpv6Port = allocateIpv6Port;
                return this;
            }

            /**
             * BackendIpv4Addr.
             */
            public Builder backendIpv4Addr(String backendIpv4Addr) {
                this.backendIpv4Addr = backendIpv4Addr;
                return this;
            }

            /**
             * BackendIpv4Port.
             */
            public Builder backendIpv4Port(String backendIpv4Port) {
                this.backendIpv4Port = backendIpv4Port;
                return this;
            }

            /**
             * EntryBandwidth.
             */
            public Builder entryBandwidth(String entryBandwidth) {
                this.entryBandwidth = entryBandwidth;
                return this;
            }

            /**
             * EntryDescription.
             */
            public Builder entryDescription(String entryDescription) {
                this.entryDescription = entryDescription;
                return this;
            }

            /**
             * EntryName.
             */
            public Builder entryName(String entryName) {
                this.entryName = entryName;
                return this;
            }

            /**
             * EntryStatus.
             */
            public Builder entryStatus(String entryStatus) {
                this.entryStatus = entryStatus;
                return this;
            }

            /**
             * Ipv6TranslatorEntryId.
             */
            public Builder ipv6TranslatorEntryId(String ipv6TranslatorEntryId) {
                this.ipv6TranslatorEntryId = ipv6TranslatorEntryId;
                return this;
            }

            /**
             * Ipv6TranslatorId.
             */
            public Builder ipv6TranslatorId(String ipv6TranslatorId) {
                this.ipv6TranslatorId = ipv6TranslatorId;
                return this;
            }

            /**
             * RegionId.
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * TransProtocol.
             */
            public Builder transProtocol(String transProtocol) {
                this.transProtocol = transProtocol;
                return this;
            }

            public Ipv6TranslatorEntry build() {
                return new Ipv6TranslatorEntry(this);
            } 

        } 

    }
    public static class Ipv6TranslatorEntries extends TeaModel {
        @NameInMap("Ipv6TranslatorEntry")
        private java.util.List < Ipv6TranslatorEntry> ipv6TranslatorEntry;

        private Ipv6TranslatorEntries(Builder builder) {
            this.ipv6TranslatorEntry = builder.ipv6TranslatorEntry;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Ipv6TranslatorEntries create() {
            return builder().build();
        }

        /**
         * @return ipv6TranslatorEntry
         */
        public java.util.List < Ipv6TranslatorEntry> getIpv6TranslatorEntry() {
            return this.ipv6TranslatorEntry;
        }

        public static final class Builder {
            private java.util.List < Ipv6TranslatorEntry> ipv6TranslatorEntry; 

            /**
             * Ipv6TranslatorEntry.
             */
            public Builder ipv6TranslatorEntry(java.util.List < Ipv6TranslatorEntry> ipv6TranslatorEntry) {
                this.ipv6TranslatorEntry = ipv6TranslatorEntry;
                return this;
            }

            public Ipv6TranslatorEntries build() {
                return new Ipv6TranslatorEntries(this);
            } 

        } 

    }
}
