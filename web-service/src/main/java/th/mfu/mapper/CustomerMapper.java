package th.mfu.mapper;

import java.util.List;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

import th.mfu.Customer;
import th.mfu.dto.CustomerDto;

@Mapper(componentModel="spring")
public interface CustomerMapper {

    CustomerMapper INSTANCE = Mappers.getMapper(CustomerMapper.class);

    // @Mapping(target = "SaleOrders", ignore = true)
    // @Mapping(target = "reviews", ignore = true)
    CustomerDto toDto(Customer entity);

    @Mapping(target = "SaleOrders", ignore = true)
    @Mapping(target = "reviews", ignore = true)
    Customer toEntity(CustomerDto dto);

    List<CustomerDto> toDtoList(List<Customer> customers);
}
