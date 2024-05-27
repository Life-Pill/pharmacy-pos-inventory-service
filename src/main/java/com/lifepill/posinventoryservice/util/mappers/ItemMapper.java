package com.lifepill.posinventoryservice.util.mappers;

import com.lifepill.posinventoryservice.dto.responseDTO.ItemGetAllResponseDTO;
import com.lifepill.posinventoryservice.dto.responseDTO.ItemGetResponseDTO;
import org.mapstruct.Mapper;
import org.springframework.data.domain.Page;

import java.util.List;


@Mapper(componentModel = "spring")
public interface ItemMapper {
    // itemList ----> ItemResponseDTO
    List<ItemGetResponseDTO> entityListToDTOList(List<Item> items);
    List<ItemGetAllResponseDTO> entityListAllItemToDTO(List<Item> items);

    //Page<Item> items ---> List<ItemGetResponseDTO> list;
    List<ItemGetResponseDTO>ListDTOToPage(Page<Item> items);
}
