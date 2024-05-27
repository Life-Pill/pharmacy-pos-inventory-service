package com.lifepill.posinventoryservice.dto.responseDTO;

import com.lifepill.possystem.dto.ItemCategoryDTO;
import lombok.*;


@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class ItemGetIdResponseDTO {
       private ItemGetAllResponseDTO itemGetAllResponseDTO;
        private ItemCategoryDTO itemCategoryDTO;
}
