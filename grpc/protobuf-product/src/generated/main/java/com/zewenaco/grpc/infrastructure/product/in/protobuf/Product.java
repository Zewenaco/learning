// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: product.proto

package com.zewenaco.grpc.infrastructure.product.in.protobuf;

public final class Product {
  private Product() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_zewenaco_grpc_ProductResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_zewenaco_grpc_ProductResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_zewenaco_grpc_ProductRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_zewenaco_grpc_ProductRequest_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\rproduct.proto\022\021com.zewenaco.grpc\"+\n\017Pr" +
      "oductResponse\022\n\n\002id\030\001 \001(\003\022\014\n\004name\030\002 \001(\t\"" +
      "\034\n\016ProductRequest\022\n\n\002id\030\001 \001(\0032g\n\016Product" +
      "Service\022U\n\ngetProduct\022!.com.zewenaco.grp" +
      "c.ProductRequest\032\".com.zewenaco.grpc.Pro" +
      "ductResponse\"\000B8\n4com.zewenaco.grpc.infr" +
      "astructure.product.in.protobufP\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_com_zewenaco_grpc_ProductResponse_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_com_zewenaco_grpc_ProductResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_zewenaco_grpc_ProductResponse_descriptor,
        new java.lang.String[] { "Id", "Name", });
    internal_static_com_zewenaco_grpc_ProductRequest_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_com_zewenaco_grpc_ProductRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_zewenaco_grpc_ProductRequest_descriptor,
        new java.lang.String[] { "Id", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
