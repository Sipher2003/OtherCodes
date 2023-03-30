import openpyxl as xl
wb=xl.load_workbook("transactions.xlsx")
sheet=wb['Sheet 1']
cell=sheet['a1']
print(cell.value)