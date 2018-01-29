import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { AppComponent } from './app.component';
import { HttpModule } from '@angular/http';
import { FormsModule } from '@angular/forms'

// componentes

import { TiendaComponent } from './tienda/tienda.component';
import { ParquesComponent } from './parques/parques.component';
import { TableComponent } from './table/table.component';
import { AnimalsComponent } from './animals/animals.component';
import { ContactComponent } from './contact/contact.component';
import { HomeComponent } from './home/home.component';
import { KeepersComponent } from './keepers/keepers.component';


@NgModule({
  declarations: [ // Directicas, componentes  y pipes
    AppComponent,
    TiendaComponent,
    ParquesComponent,
    TableComponent,
    AnimalsComponent,
    ContactComponent,
    HomeComponent,
    KeepersComponent
  ],
  imports: [ //
    BrowserModule,
    FormsModule,
    HttpModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
