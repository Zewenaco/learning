package com.zewenaco.grpc.server.infrastructure.in.grpc.server;

import com.zewenaco.grpc.infrastructure.product.in.protobuf.ProductRequest;
import com.zewenaco.grpc.infrastructure.product.in.protobuf.ProductResponse;
import com.zewenaco.grpc.infrastructure.product.in.protobuf.ProductServiceGrpc.ProductServiceImplBase;
import io.grpc.stub.StreamObserver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import net.devh.boot.grpc.server.service.GrpcService;

@GrpcService
public class ProductServiceImpl extends ProductServiceImplBase {

    Logger log = LoggerFactory.getLogger(ProductServiceImpl.class);

    @Override
    public void getProduct(ProductRequest request, StreamObserver<ProductResponse> responseObserver) {
        log.info("Receiving request with input data -> " + request.getId());
        responseObserver.onNext(ProductResponse.newBuilder()
                .setId(request.getId())
                .setName("Product").build());
        responseObserver.onCompleted();
    }
}
