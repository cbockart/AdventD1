/**
 * @param {number[]} gifts - The array of gifts to prepare
 * @returns {number[]} An array with the prepared gifts
 */
function prepareGifts(gifts) {
  //Check for empty array
  if(gifts.length === 0)
  {
    return [];
  }
  else
  {
    //Check for duplicate values 
    gifts = gifts.filter((item, index) => gifts.indexOf(item) === index);
    //Sort in ascending order
    gifts.sort();
  }

  return gifts;
}
