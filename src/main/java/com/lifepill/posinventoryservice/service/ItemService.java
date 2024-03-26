package com.lifepill.posinventoryservice.service;

import com.lifepill.posinventoryservice.dto.paginated.PaginatedResponseItemDTO;
import com.lifepill.posinventoryservice.dto.requestDTO.ItemSaveRequestDTO;
import com.lifepill.posinventoryservice.dto.requestDTO.ItemUpdateDTO;
import com.lifepill.posinventoryservice.dto.responseDTO.ItemGetAllResponseDTO;
import com.lifepill.posinventoryservice.dto.responseDTO.ItemGetResponseDTO;

import java.util.List;

public interface ItemService {
    String saveItems(ItemSaveRequestDTO itemSaveRequestDTO);
    List<ItemGetResponseDTO> getItemByNameAndStatusBymapstruct(String itemName);
    List<ItemGetResponseDTO> getItemByNameAndStock(String itemName);
    List<ItemGetResponseDTO> getItemByStockStatus(boolean activeStatus);
    String updateItem(ItemUpdateDTO itemUpdateDTO);
    String deleteItem(int itemId);

    List<ItemGetAllResponseDTO> getAllItems();

    //List<ItemGetResponseDTO> getItemByActiveStatusLazy(boolean activeStatus);
    PaginatedResponseItemDTO getItemByStockStatusWithPaginateed(boolean activeStatus, int page, int size);

    List<ItemGetResponseDTO> getItemByBarCode(String itemBarCode);

    List<ItemGetResponseDTO> getItemById(int itemId);

//    List<ItemGetResponseDTO> getAllItems();
}
